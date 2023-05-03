package final_SL_tutorial;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public School() {
        this.teachers = new ArrayList<Teacher>();
        this.students = new ArrayList<Student>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
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
        return "School has " + teachers.size() + " teachers and " + students.size() + " students";
    }
}
