package abstractjava.abstract7;


public class BankColoradoPOS implements VirtualPOS {
    @Override
    public boolean pay(String creditCardNo, double amount) {
        System.out.println("Commission Rate is:" + commissionRate);
        System.out.println("Colorado Bank Virtual POS Payment: " + creditCardNo +
                ":" + amount);
        return true;
    }

    @Override
    public boolean payBack(String creditCardNo, double amount) {
        System.out.println("Colorado Bank Virtual POS Payment Back: " + creditCardNo +
                ":" + amount);
        return true;
    }

    @Override
    public boolean provision(String creditCardNo, double amount) {
      
        VirtualPOS.isValidCreditCardNumber("1111222233334444");
        System.out.println("Colorado Bank Virtual POS Provision: " + creditCardNo +
                ":" + amount);
        return true;
    }

}