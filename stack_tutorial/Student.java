package stack_tutorial;

class Student {
    private int studentId;
    private int finalScore;
    
    public Student(int studentId, int finalScore) {
        this.studentId = studentId;
        this.finalScore = finalScore;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public int getFinalScore() {
        return finalScore;
    }
    
    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Final Score: " + finalScore;
    }
}
