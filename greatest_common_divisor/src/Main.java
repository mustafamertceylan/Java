import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter by first number");
        int num1=scanner.nextInt();
        System.out.println("Enter by second number");
        int num2=scanner.nextInt();
        int divisor=0;
        for (int i=1;i<=((num1>=num2) ? num2:num1);i++){
            if(num1%i==0 && num2%i==0) {
                divisor = i;
            }
        }
        System.out.println("The greatest common divisor of the entered numbers : "+divisor);
    }
}