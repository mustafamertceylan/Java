public class PayPallPayment extends Payment{
    public PayPallPayment(double amount){
        super(amount);
    }

    @Override
    double calculateDiscount() {
        return amount*0.03;
    }

}
