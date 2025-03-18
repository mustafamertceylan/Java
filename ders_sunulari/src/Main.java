
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        //burada rastgele toplama işlemlerini kullanıcının yapmasını isteyen bir kod parçası
        /*int sayi1=(int)(Math.random()*10);
        int sayi2=(int)(Math.random()*10);
        System.out.println(sayi1+" + "+sayi2+" = ?" );
        int tahmin=girdi.nextInt();
        if (tahmin==sayi1+sayi2){
            System.out.println("Correct :)");
        }
        else{
            System.out.println("Wrong :(");
        }*/
        System.out.println("Please entered an integer");
        int sayi3=girdi.nextInt();
        if(sayi3%5==0){
            if(sayi3%2==0){
                System.out.println("hi even");
            }
            else{
                System.out.println("hi five");
            }
        }
        else{
            System.out.println("The entered number is not divisible by 5");
        }
        System.out.println(Math.pow(sayi3,2));

    }
}