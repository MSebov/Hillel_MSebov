import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Accessors(chain = true)
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id_student")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "student_group")
    private int studentGroup;

    @Column(name = "year_join")
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
