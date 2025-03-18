//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Circle circle=new Circle();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please, entered by circle's radius");
    circle.radius=scanner.nextInt();
    System.out.println("Circle's area is "+circle.area(circle.radius));

    }}



class Circle{
    int radius;
    final double PI=3.14;
    public double area(int radius){
        double circle_area=radius*radius*PI;
        return circle_area;
    }
}