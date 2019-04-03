package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    List<Student> students = new ArrayList<>();


    public University(String name) {
    }

    public void setStudent(Student student) {

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
