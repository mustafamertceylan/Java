
public class Main {
    public static void main(String[] args) {
        int toplam_cift=0,toplam_tek=0;
        for(int i=0;i<=50;i++){
            if(i%2==0){
                toplam_cift+=i;
            }
            else{
                toplam_tek+=i;
            }
        }
        System.out.println("tek sayıların toplamı "+toplam_tek);
        System.out.println("çift sayıların toplamı "+toplam_cift);

    }
}