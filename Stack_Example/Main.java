package Stack_Example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Create a new Stack object to hold Student objects
        Stack<Student> studentStack = new Stack<>();
        Stack<Student> emptyStack = new Stack<>();

        // Add 5 Student objects to the stack
        studentStack.push(new Student("John Doe", 20, "Computer Science", 85));
        studentStack.push(new Student("Jane Smith", 21, "Mathematics", 90));
        studentStack.push(new Student("Bob Johnson", 19, "Physics", 92));
        studentStack.push(new Student("Alice Brown", 22, "Chemistry", 88));
        studentStack.push(new Student("Charlie Lee", 18, "Biology", 87));
    }

    // Tested
    public static void displayStack(Stack<Student> students) {
        Stack<Student> temp = new Stack<>();
        while(!students.isEmpty()) {
            Student currentStudent = students.pop();
            System.out.println(currentStudent.getName()+ " " + currentStudent.getGrade());
            temp.push(currentStudent);
        }
        while(!temp.isEmpty()) {
            students.push(temp.pop());
        }
    }

    // Good object reference example
    // Tested
    public static void transferHighGrades(Stack<Student> students, Stack<Student> empStack) {
        while(!students.isEmpty()) {
            Student currentStudent = students.pop();
            if(currentStudent.getGrade() >= 90) {
                empStack.push(currentStudent);
            }
        } 
    }

    // Tested
    public static int findMaximumGrade(Stack<Student> students) {
        Stack<Student> temp = new Stack<>();
        Student firstStudent = students.pop();
        int maxGrade = firstStudent.getGrade();
        temp.push(firstStudent);
        while (!students.empty()) {
            Student currentStudent = students.pop();
            int currentGrade = currentStudent.getGrade();
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
            }
            temp.push(currentStudent);
        }
        while(!temp.isEmpty()) {
            students.push(temp.pop());
        }
        return maxGrade;
    }

    // Also modify to return boolean
    // Tested
    public static boolean removeStudent(Stack<Student> students, String name) {
        boolean found = false;
        Stack<Student> temp = new Stack<>();
        while (!students.isEmpty()) {
            Student currentStudent = students.pop();
            String currentName = currentStudent.getName();
            if (currentName != name) {
                temp.push(currentStudent);
            } else {
                found = true;
            }
        }
        while(!temp.isEmpty()) {
            students.push(temp.pop());
        }

        return found;
    }
}

