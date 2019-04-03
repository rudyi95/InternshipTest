package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name, int level) {
        this.name = name;
        this.knowledge = new Knowledge(level);
    }

    public void setKnowledge(Knowledge knowledge) {

    }

    public int getLevel() {
        return knowledge.getLevel();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + knowledge +
                '}';
    }
}
