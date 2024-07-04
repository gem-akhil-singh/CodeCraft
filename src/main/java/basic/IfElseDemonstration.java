package basic;

import java.util.Scanner;

/*
Write a Program to demonstrate if else clause with following scenario:
Assume Passing Marks to be final at 40.
Take Marks Obtained from user as input.
If Marks obtained is greater than equal to Passing Marks, then output to console as “You passed the exam”
Else output to console as “Unfortunately you failed to pass the exam”.
 */
public class IfElseDemonstration {

    public static void main(String[] args) {
        int passingMarks = 40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Obtained Marks");
        int obtainedMarks = scanner.nextInt();
        if(obtainedMarks>=passingMarks){
            System.out.println("You Passed the exam");
        }else {
            System.out.println("Unfortunately you failed to pass the exam");
        }

    }
}
