// ilk 50 asal sayıyı ekrana bastırman gerek
// bastırırken yapman gereken her satırda 10 tane asal sayı olmalı
public class Main {
    public static void main(String[] args) {
        Prime_num prime=new Prime_num();
        int iteration=0;
        int num=1;
        while(iteration<50){
            while(num>0){
                if(Prime_num.prime_number(num)){
                    System.out.print(num+"  ");
                    iteration++;
                    num++;
                    break;
                }
                else{
                    num++;
                }
            }
            if(iteration%10==0){
                System.out.println(" ");
            }
        }

    }
}


class Prime_num{
    public static boolean prime_number(int num){
        int divisor=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                divisor++;
            }
        }
        if(divisor==2){
            return true;
        }
        else{
            return false;
        }
    }
}