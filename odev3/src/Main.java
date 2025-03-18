
public class Main {
    public static void main(String[] args) {

        CreditCardPayment credicardpayment=new CreditCardPayment(1000);
        System.out.println("indirimli miktar kredi kartı ödemesiyle "+credicardpayment.calculateDiscount("welcome10"));
        System.out.println("indirimli miktar kredi kartı ödemesiyle  "+credicardpayment.calculatingDiscount("vip",8));


        PayPallPayment paypallpayment=new PayPallPayment(1000);
        System.out.println("indirimli miktar paypall ödemesiyle  "+paypallpayment.calculateDiscount("welcome10"));
        System.out.println("indirimli miktar paypall ödemesiyle "+paypallpayment.calculatingDiscount("vip",8));


        CryptoPayment cryptopayment=new CryptoPayment(1000);
        System.out.println("indirimli miktar cryptoyla ödemeyle "+cryptopayment.calculateDiscount("welcome10"));
        System.out.println("indirimli miktar cryptoyla ödemeyle "+cryptopayment.calculatingDiscount("vip",8));



    }
}