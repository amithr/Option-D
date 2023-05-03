package stack_tutorial;

import java.util.Stack;

public class StudentStack {
    public static void main(String[] args) {
        Stack<Student> myStack = new Stack<Student>();
        
        // Add 5 Student objects to the stack
        myStack.push(new Student(1, 85));
        myStack.push(new Student(2, 92));
        myStack.push(new Student(3, 78));
        myStack.push(new Student(4, 95));
        myStack.push(new Student(5, 87));
        
        // Find and remove the minimum final score
        int min = myStack.pop().getFinalScore();
        while (!myStack.isEmpty()) {
            int temp = myStack.pop().getFinalScore();
            if (temp < min) {
                min = temp;
            }
        }
        
        // Calculate the average final score
        int sum = 0;
        int count = 0;
        for (Student s : myStack) {
            sum += s.getFinalScore();
            count++;
        }
        double avg = (double)sum / count;
        
        System.out.println("Minimum final score: " + min);
        System.out.println("Average final score: " + avg);
    }
}

