import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ortalamaUstu(1,100);

//        int[] dizi=new int[10];
//        for (int i=0;i<dizi.length;i++){
//            dizi[i]= (int) (Math.random()*100);
//        }
//        for (int i=0;i<dizi.length;i++){
//            System.out.println(dizi[i]);
//            if (i==dizi.length-1){
//                System.out.println("");
//                System.out.println("");
//
//            }
//        }

//        //dizinin elemanlarını karıştırma
//        for (int i=0;i<dizi.length;i++){
//            int index=(int) Math.random()*dizi.length;
//            int temp=dizi[i];
//            dizi[i]=dizi[index];
//            dizi[index]=temp;
//        }
        //deneme(dizi);//dizinin elemanları metot içinde değiştirmek main içinde değişikliğe sebep oluyormuş
        
//        for (int i=0;i<dizi.length;i++){
//            System.out.println(dizi[i]);
//        }

        // ilk haftanın lab örnekleri
        //System.out.println("Dairenin yariçapını giriniz");
        //int yaricap=input.nextInt();
        //daireAlanHesapla(yaricap);

//        System.out.println("Ters çevirilecek sayiyi giriniz");
//        int sayi=input.nextInt();
//        tersCevir(sayi);

        //tahminOyunu();
        //sayiKontrol(177583,7);




    }
    public static void ortalamaUstu(int a,int b){
        int ortalama=0,count=0;
        for (int i=a;i<=b;i++){
            ortalama+=i;
            count++;
        }
        ortalama=ortalama/count;
        for (int i=a;i<=b;i++){
            if(i>=ortalama){
                System.out.println(i);
            }
        }
    }
    public static void deneme(int [ ] dizi){
        dizi[0]=5;
    }

    public static void daireAlanHesapla(int yaricap){
        double alan=Math.pow(yaricap,2)*Math.PI;
        System.out.println(yaricap+" yaricapa sahip dairenin alanı : "+alan);
    }

    public static void tersCevir(int sayi){
        int num=0;
        while(sayi>0){
            num = num * 10 + (sayi % 10);
            sayi=sayi/10;

        }
        System.out.println("Ters çevrilmiş sayi : "+num);

    }

    public static void tahminOyunu(){
        System.out.println("Sayi tahmin oyununa hoşgeldiniz");
        Scanner input=new Scanner(System.in);
        Random random =new Random();
        System.out.println("Lütfen tahmininizi giriniz (aranan sayi 1 ile 100 arasındadır)");
        int tahmin=input.nextInt();
        boolean durum=true;
        int sayi= random.nextInt(100);


        while(durum){
            if(tahmin==sayi){
                durum=false;
                System.out.println("doğru tahmin kutlarım...");
            }
            else if (tahmin<sayi) {
                System.out.println("daha yüksek bir tahmin giriniz");
                tahmin=input.nextInt();
            }
            else{
                System.out.println("daha küçük bir sayi giriniz");
                tahmin=input.nextInt();
            }

        }
    }
    public static void sayiKontrol(int sayi,int aranan){
        int sayac=0;
        int kontrol=0;
        while(sayi>0){
            kontrol=sayi%10;
            sayi=sayi/10;
            if (kontrol==aranan){
                sayac+=1;
            }
        }
        System.out.println("Aranılan sayı "+sayac+" defa geçmektedir");
    }
}