package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    List<Student> interns = new ArrayList<>();

    public Internship(String name) {
    }

    public void setStudent(Student student) {

    }

    public void addIntern(Student student){
        interns.add(student);
    }
    public List<Student> getStudents() {
        return interns;
    }


}
