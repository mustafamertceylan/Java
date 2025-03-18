public class CryptoPayment extends Payment{
    public CryptoPayment(double amount){
        super(amount);
    }

    @Override
    double calculateDiscount() {
        return amount*0.02;
    }
}
