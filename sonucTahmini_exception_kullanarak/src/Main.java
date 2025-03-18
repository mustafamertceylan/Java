import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int tahmin;
        int sonuc=0,sayi1,sayi2;
        while(true){
            System.out.println((char)((int)('a')+Math.random()*((int)('z')-(int)('a'))));
        }




    }
    public int  OyunuBaslat(){
        System.out.println("Oynamak istediğiniz oyunun numarasını giriniz...");
        System.out.println("Yeni oyuna başlamak için * giriniz...");
        System.out.println("1-Toplama" +
                "2-Çarpma" +
                "3-Çıkarma");
        Scanner input=new Scanner(System.in);
        int secim=input.nextInt();
        return secim;

    }


}