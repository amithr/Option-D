package TwoD_Arrays_Example;

public class Main {
    public static void main(String[] args) {
    int[][] grades = {{99, 75, 68, 21, 98},
                    {100, 89, 73, 55, 77},
                    {100, 45, 99, 89, 71},
                    {99, 75, 89, 99, 100},
                    {89, 100, 54, 65, 99}};

    double average = getAverageGrade(grades);
    System.out.println(average);
    }


    // tested
    public static void outputGrades(int[][] grades) {
        for(int i = 0; i < grades.length; i++) {
            for(int j = 0; j < grades[i].length; j++) {
                System.out.println(grades[i][j]);
            }
        }
    }

    // tested
    public static double getAverageGrade(int[][] grades) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum = sum + grades[i][j];
                count++;
            }
        }
        double average = sum/count;
        return average;
    }
    
    

}

