package intermediate.Exception;

public class DemoExcpetion {

    public static void main(String[] args) {
        try{
            System.out.println("trying custom Exception");
            throw new CustomException("Custom Exception");
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
