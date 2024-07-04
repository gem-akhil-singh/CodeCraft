package intermediate.Polymorphism;

public class CashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment Made thorugh Cash");
    }
}
