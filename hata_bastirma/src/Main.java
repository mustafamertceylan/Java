
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
        public void dizitopla(int []dizi,int boyut){
            try {
                int toplam = 0;
                for (int i = 0; i < boyut; i++) {
                    toplam += dizi[i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("hata oluştu " + e.getMessage());
            }
            catch (Exception e){
                System.err.println("hata var "+e);
            }
        }
        dizi = new int[]{1, 2, 3, 4, 5, 6};
        dizitopla(dizi,7);




    }
}


