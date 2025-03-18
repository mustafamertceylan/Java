
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Circle circle1=new Circle(1.2);
        double area= circle1.get_area(circle1.radius);
        System.out.println(area);
        System.out.println(circle1);


        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());

        int  sayi=(int)(Math.random()*10);
        System.out.println(sayi);

        System.out.println(Count.count);
        new Count();
        System.out.println(Count.count);


    }
}