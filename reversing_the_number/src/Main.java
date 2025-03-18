import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int number;
    System.out.println("Please enter 3-digit number");
    number=scanner.nextInt();
    Number number1=new Number();
    number1.analysis(number);
    System.out.print("Reversing number is ");
    System.out.print(number1.first+""+number1.second+""+number1.third);

    }
}
class Number{
    int first;
    int second;
    int third;
    public void analysis(int num){
        first=num%10;
        num=num/10;
        second=num%10;
        num=num/10;
        third=num;
    }


}