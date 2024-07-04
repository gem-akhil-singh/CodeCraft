package basic;

// Find the largest number out of 3 numbers
public class LargestNumber {
    public static void main(String[] args) {

        int a = 14;
        int b = 3;
        int c = 10;


        if(a>b && a>c){
            System.out.println("Largest Number : " +  a);
        }else if(b>a && b>c){
            System.out.println("largest number : " + b);
        }else if(c>a && c>b){
            System.out.println("largest number : " + c);
        }else{
            System.out.println("numbers are equal");
        }
    }
}
