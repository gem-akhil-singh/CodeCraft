package basic;


import java.util.Scanner;

// Write a program to print resverse number in java
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int rem ;
        int reverse = 0;
        while(input>0){
            rem = input%10;
            reverse = (reverse*10) + rem;
            input = input/10;
        }
        System.out.println(reverse);
    }
}
