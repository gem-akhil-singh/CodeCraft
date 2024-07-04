package intermediate.Polymorphism;

import javax.security.auth.login.CredentialException;

public class Polymorphism {

    public static void main(String[] args) {
        Payment cash = new CashPayment();
        Payment credit = new CreditPayment();

        cash.pay();;
        credit.pay();
    }
}

