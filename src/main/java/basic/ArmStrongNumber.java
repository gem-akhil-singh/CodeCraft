package basic;

import java.util.Scanner;
/*
Armstrong number
sum of cube of individual number is equal to the number itself
 */
public class ArmStrongNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        int remainder,originalNumber,result = 0;

        originalNumber=number;
        while (originalNumber!=0){
            //extract number
            remainder = originalNumber%10;
            result+= Math.pow(remainder,3);
            originalNumber = originalNumber/10;
            
        }

        if(result==number){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Mot amrmostrong");
        }
    }
}
