//burada arraylistler ve encapsulation örnekleri mevcuttur genel tanımlamalar ve kullanım örnekleri

import java.util.ArrayList;// arraylist'i import etmemiz lazım kullanacaksak
public class Main {
    public static void main(String[] args) {
    /*Cars cars =new Cars();
    cars.setColors("greey");
    System.out.println(cars.getColors());
        cars.setModel("bmw");
        System.out.println(cars.getModel());
        cars.setDoors(3);
        System.out.println(cars.getDoors());*/
        //bu kodlar yerine constractors tanımlayarak daha kısa şekilde nesneye başlangıç değerleri atanabilir
//    Cars car1=new Cars("black",4,"bmw");
//    Cars car2=new Cars("greey","mercedes");
//    car1.showInfos();
//    car2.showInfos();
    ArrayList<Integer> arr=new ArrayList<Integer>();
    arr.add(9);// .add ile eleman eklenir
        //arrraylistler dinamik bir dizidir yani eleman sayısını belirtmeden işlemler yapabiliriz
    arr.remove(0);//iki şekilde silebiliriz ya index numarasına göre yada elemanı direkt olarak yazacağız
    arr.add(3);
        for(int i=0;i<30;i++){
        arr.add(i+1);//arr.add(num) ekleme yapar
    }
    for (int i=0;i<arr.size();i++){//arr.size() boyutu verir
        System.out.println(arr.get(i));//elemana ulaimak için arr.get(i) kod satırını kullandık
    }
    System.out.println(arr.indexOf(9));//9 elemanının bulunduğu index numarasını verir






    }
}