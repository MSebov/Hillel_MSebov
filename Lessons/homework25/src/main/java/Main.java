import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Session session;

    public static void main(String[] args) {
        session = Connect.getSession();


        // добавление сущности студента
//        Student student = new Student();
//        student.setFullName("Test Name");
//        student.setStudentGroup(5);
//        student.setYearJoin(2020);
//        addNewStudent(student);

        outputAllStudent();

        Connect.closeSession();
    }

    public static void addNewStudent(Student student) {
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
    }

    public static void outputAllStudent() {
        session.beginTransaction();
//        Query query = session.createQuery("from Student");
        Query query = session.createQuery("from Student");

        List<Student> studentList = query.list();
        studentList.forEach(System.out::println);
    }
}
