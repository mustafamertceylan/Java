import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int number=(int)(Math.random()*99+1);
       System.out.println("Please entered by integer");
       int guess=scanner.nextInt();
       while(true) {
           if (guess == number) {
               System.out.println("Correct :)");
               break;
           } else {
               if (guess > number) {
                   System.out.print("Please enter a smaller integer");
                   guess=scanner.nextInt();
               } else {
                   System.out.println("Please enter a larger integer");
                   guess=scanner.nextInt();
               }
           }
       }

    }
}