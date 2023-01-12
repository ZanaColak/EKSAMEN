package Ovelse16Exam;

import java.util.Random;

public class ExamQuestion {
    private int number;
    private int grade;
    Random random = new Random();

    public ExamQuestion(int number, int grade){
        this.number = number;
        this.grade = grade;
    }
    public ExamQuestion(){

    }
    public void randomGrade(){
        number = random.nextInt(12) + 1;
        if (number == 12){
            System.out.println('A');
        } else if (number == 10) {
            System.out.println('B');
        } else if (number == 7) {
            System.out.println('C');
        } else if (number == 4) {
            System.out.println('D');
        } else if (number == 2) {
            System.out.println('E');
        } else if (number == 0) {
            System.out.println('F');
        }else if (number > 12){
            System.out.println("Karakteren skal være mellem 00 til 12");
        }
        System.out.println(grade);
    }
}
