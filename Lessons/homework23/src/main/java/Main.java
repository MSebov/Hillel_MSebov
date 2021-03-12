import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static PreparedStatement preparedStatement;
    static Statement statement;
    static ResultSet resultSet;
    static Connection connection;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "rootroot");

//        Student student = new Student();
//        student.setFullName("Maksim");
//        student.setYearJoin(2021);

//        addNewStudent(student);

//        removeStudentById(423432);

        outputAllStudent();
    }

    // метод который добавляет сущность студента
    public static void addNewStudent(Student student) throws SQLException {
        preparedStatement = connection.prepareStatement("insert into student (full_name, year_join) values (?, ?)");
        preparedStatement.setString(1, student.getFullName());
        preparedStatement.setInt(2, student.getYearJoin());
        preparedStatement.execute();
    }

    public static void removeStudentById(int id) throws SQLException {
        preparedStatement = connection.prepareStatement("delete from student where id_student = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }

    public static void outputAllStudent() throws SQLException {
        List<Student> students = new ArrayList<>();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from student");

        while (resultSet.next()) {
            int id = resultSet.getInt("id_student");
            String fullName = resultSet.getString("full_name");
            int studentGroup = resultSet.getInt("student_group");
            int year = resultSet.getInt("year_join");

            Student st = new Student();
            st.setId(id);
            st.setFullName(fullName);
            st.setStudentGroup(studentGroup);
            st.setYearJoin(year);

            students.add(st);
        }

        students.forEach(System.out::println);
    }
}
