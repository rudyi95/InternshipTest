package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {

        Random rd = new Random();
        int level = rd.nextInt(100);
        int level2 = rd.nextInt(100);
        int level3 = rd.nextInt(100);

        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", level));
        university.addStudent(new Student("Julia Veselkina", level2));
        university.addStudent(new Student("Maria Perechrest", level3));

        List<Student> students = university.getStudents();
        System.out.println(students);

        Internship internship = new Internship("Interlink");

        for (Student student:students) {
            if (student.getLevel()>50){
                internship.addIntern(student);
            }
        }

        List<Student> students1 = internship.getStudents();
        System.out.println("List of internship's students:");
        System.out.println(students1);

    }
}
