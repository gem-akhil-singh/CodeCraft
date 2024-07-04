package intermediate.Polymorphism;

public class CreditPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment made through Credit");
    }
}
