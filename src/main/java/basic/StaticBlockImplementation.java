package basic;

public class StaticBlockImplementation {
    static int i;
    int j;

    static {

        i=40;
        i=i+10;
        System.out.println("Incremented i by 10");
    }

    public StaticBlockImplementation(){
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {

        StaticBlockImplementation blk = new StaticBlockImplementation();

        System.out.println("Printing From MainMethod"+i);

    }

}
