public class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount){
        super(amount);
    }

    @Override
    double calculateDiscount() {
        return amount*0.05;
    }
}
