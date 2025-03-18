abstract class Payment {
 protected double amount;
 public Payment(double amount){
     this.amount=amount;
 }
 abstract double calculateDiscount();

 public double calculateDiscount(String code){
     double discount=calculateDiscount();
     if ("welcome10".equals(code)){
         discount=amount*0.1;
     }
     else if ("vip".equals(code)){
         discount=amount*0.15;
     }

     return amount-discount;

 }


 public double calculatingDiscount(String code,int years){
     double discount=calculateDiscount();
     if (years>=5){
         discount=amount*0.05;
     }
     return amount-discount;
}

}
