package Recursion_Example;

// https://dev.to/javinpaul/top-20-recursion-practice-problems-and-exercises-for-programming-interviews-3lne

public class Main {
    public static void main(String[] args) {

    }

    public int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        if(base == 0) {
            return 0;
        }
        return base * power(base, exponent-1);
    }

    public boolean isPalindrome(String word) {
        if(word.length() <= 1) {
            return true; 
        }
        if(word.charAt(0) == word.charAt(word.length()-1)) {
            return isPalindrome(word.substring(1, word.length()-2));
        } else {
            return false;
        }
    }   
}
