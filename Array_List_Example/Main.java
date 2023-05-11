package Array_List_Example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Create a new ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();

        Student jamesObject = new Student("John Doe", 20, "Computer Science", 85);
        Student janeObject = new Student("Jane Smith", 21, "Mathematics", 90);

        // Add 5 Student objects to the ArrayList
        studentList.add(jamesObject);
        studentList.add(janeObject);
        studentList.add(new Student("Bob Johnson", 19, "Physics", 92));
        studentList.add(new Student("Alice Brown", 22, "Chemistry", 88));
        studentList.add(new Student("Charlie Lee", 18, "Biology", 87));

        Student[] students = {jamesObject, janeObject};
        ArrayList<Student> empList = new ArrayList<>();
    }

    // Tested
    public static void arrayToArrayList(Student[] students, ArrayList<Student> empList) {
        for(int i=0; i < students.length; i++) {
            empList.add(students[i]);
        }
    }

    // Tested
    public static Student[] arrayListToArray(ArrayList<Student> studentList) {
        Student[] students = new Student[studentList.size()];
        int studentCounter = 0;
        while(studentCounter < studentList.size()) {
            students[studentCounter] = studentList.get(studentCounter);
            studentCounter++;
        }
        return students;
    } 

    // Tested
    public static Student[] arrayListToArrayWithIter(ArrayList<Student> studentList) {
        Student[] students = new Student[studentList.size()];
        ListIterator<Student> studentIter = studentList.listIterator();
        int studentCounter = 0;
        while(studentIter.hasNext()) {
            students[studentCounter] = studentIter.next();
            studentCounter++;
        }
        return students;
    } 
}
