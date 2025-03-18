//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //nesne içerisinde değer tutmamıza yarayan alanlardır
        my_class m1 =new my_class();//nesne oluşturduk
        //myclass sınıfından bir nesne bu şekilde türetilebilir
        //m1.a=1;
        System.out.println(m1.a);//ekranda varsayılan değer olan 0 görünür
        System.out.println(m1.b);//varsayılan olarak \0 değeri okunur
    }
     static class my_class{
       public int a;
       public char b;
        //bundan sonra bu classtan oluşturulan nesnelerde a fieldı hepsinde bulunur.
        //sadece class içerisinde tanımlan değişkenler field olarak kabul edilir

    }
}