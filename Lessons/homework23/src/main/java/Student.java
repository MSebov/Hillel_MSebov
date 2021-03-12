public class Student {
    private int id;
    private String fullName;
    private int studentGroup;
    private int yearJoin;

    @Override
    public String toString() {
        return "Name: " + fullName + " ID: " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(int studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int getYearJoin() {
        return yearJoin;
    }

    public void setYearJoin(int yearJoin) {
        this.yearJoin = yearJoin;
    }
}
