package final_SL_tutorial;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private String subject;
    private ArrayList<Student> students;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String toString() {
        return "Teacher name: " + name + ", subject: " + subject + ", students: " + students;
    }
}

