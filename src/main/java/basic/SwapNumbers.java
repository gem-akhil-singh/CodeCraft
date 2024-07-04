package basic;

/*
Write a Program to Swap Two Number Using Third Variable.
 */
public class SwapNumbers {

    public static void main(String[] args) {

        int a = 9;
        int b = 6 ;
        int c;
        System.out.println("Unswapped numbers a : " + a + " b : "+b );
        c =a;
        a = b;
        b =c;

        System.out.println("after swapping a : "+a  + " b : " + b);



    }
}
