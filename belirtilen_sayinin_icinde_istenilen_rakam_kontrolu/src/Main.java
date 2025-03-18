//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    System.out.println("bir sayi giriniz");
    int sayi=giris.nextInt();
    System.out.println("aranilan rakami giriniz");
    int aranilan=giris.nextInt();
    boolean bulduk=false;
    while(sayi>0){
        if(sayi%10==aranilan){
            System.out.println("aranilan rakam girilen sayi içerisinde mevcuttur");
            bulduk=true;
            break;
        }
        else {
            sayi=sayi/10;
        }

    }
    if(bulduk==false)
        System.out.println("girilen sayi icerisinde aranılan rakam mevcut degildir.");


    }
}