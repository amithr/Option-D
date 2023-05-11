package linked_list_example;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Create a new LinkedList object to hold Student objects
        LinkedList<Student> studentList = new LinkedList<>();

        Student jamesObject = new Student("John Doe", 20, "Computer Science", 85);
        Student janeObject = new Student("Jane Smith", 21, "Mathematics", 90);

        Student[] studentArray = {jamesObject, janeObject};

        // Add 5 Student objects to the list
        studentList.add(jamesObject);
        studentList.add(janeObject);
        studentList.add(new Student("Bob Johnson", 19, "Physics", 92));
        studentList.add(new Student("Alice Brown", 22, "Chemistry", 88));
        studentList.add(new Student("Charlie Lee", 18, "Biology", 87));

        studentList.remove(jamesObject);
        studentList.removeLast();

        LinkedList<Student> newStudentList = arrayToLinkedList(studentArray);
        displayStudentInfo(newStudentList);
        
    }

    // Tested
    public static void displayStudentInfo(LinkedList<Student> studentList) {
        int index = 0;
        while(index < studentList.size()) {
            Student currentStudent = studentList.get(index);
            System.out.println(currentStudent.getName() + " "+ currentStudent.getGrade());
            index++;
        }
    }
    
    // Tested
    public static LinkedList<Student> arrayToLinkedList(Student[] studentArray) {
        LinkedList<Student> studentList = new LinkedList<>();
        for(int i = 0; i < studentArray.length; i++) {
            studentList.addLast(studentArray[i]);
        }
        return studentList;
    }

    // Tested
    public static Student[] linkedListToArray(LinkedList<Student> studentList) {
        Student[] studentArray = new Student[studentList.size()];
        int studentArrayIndex = 0;
        while(studentArrayIndex < studentList.size()) {
            studentArray[studentArrayIndex] = studentList.get(studentArrayIndex);
            studentArrayIndex++;
        }
        return studentArray;
    }

    // Tested
    public static Student[] iteratorlinkedListToArray(LinkedList<Student> studentList) {
        Student[] studentArray = new Student[studentList.size()];
        int studentArrayIndex = 0;
        ListIterator<Student> studentIterator = studentList.listIterator();
        while (studentIterator.hasNext()) {
            studentArray[studentArrayIndex] = studentIterator.next();
            studentArrayIndex++;
        }
        return studentArray;
    }

    // Tested
    public static int findMaximum(LinkedList<Student> studentList) {
        int maximum = studentList.getFirst().getGrade();
        ListIterator<Student> studentIterator = studentList.listIterator();
        while(studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            int currentGrade = currentStudent.getGrade();
            if(currentGrade > maximum) {
                maximum = currentGrade;
            } 
        }
        return maximum;
    }

    // Tested
    public static boolean removeByName(LinkedList<Student> studentList, String name) {
        int index = 0;
        while(index < studentList.size()) {
            Student currentStudent = studentList.get(index);
            if (currentStudent.getName() == name) {
                studentList.remove(index);
                return true;
            }
        }
        return false;
    }

    public LinkedList<Student> combineLinkedLists(LinkedList<Student> listOne, LinkedList<Student> listTwo) {
        LinkedList<Student> combinedList = new LinkedList<>();
        ListIterator<Student> iter1 = listOne.listIterator();
        ListIterator<Student> iter2 = listTwo.listIterator();
        while(iter1.hasNext()) {
            combinedList.addLast(iter1.next());
        }
        while(iter2.hasNext()) {
            combinedList.addLast(iter2.next());
        }
        return combinedList;
    }


}

