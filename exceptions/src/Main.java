
public class Main {
    public static void main(String[] args) {
        //burada temel bir exception uygulaması mevcuttur
//aynı hatayı catch içinde iki defa yakalamaya çalışırsak hata alırız
        //        try{
//            int x=0;
//            int y=5/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException error");
//        }
//        catch (Exception e){
//            System.out.println("Exception error");
//        }


        //burada olmayan bir dizi elemanına ulaşmaya çalışıyoruz
//        int []dizi = new int[]{1, 2, 3, 4, 5, 6};
//        dizitopla(dizi,7);
//    }
//    public static void dizitopla(int []dizi,int boyut){
//        try {
//            int toplam = 0;
//            for (int i = 0; i < boyut; i++) {
//                toplam += dizi[i];
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("hata oluştu " + e.getMessage());
//            //çıktı alırken err yazmak çıktıyı kırmızı yazdırır
//        }
//        catch (Exception e){
//            System.err.println("hata var "+e);
//        }
        Main obj=new Main();
        String[] str={"1","2","3","4c","5c"};


    }
    //buradaki kodda birimler arası dönüşüm yaparken çıkan hatayı yakaladık
//    public static void kontrol(String[] str){
//        int count =0;
//        do{
//            try{
//                int num=Integer.parseInt(str[count]);
//                System.out.println(num);
//            }
//            catch (NumberFormatException e){
//                System.err.println("dönüşüm hatası aldın : "+e.getMessage());
//            }
//            catch (Exception e){
//                System.out.println("hata aldın "+e.getMessage());
//            }
//            finally {
//                count++;
//            }
//
//        }
//        while(count< str.length);
//    }

}
