
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci();
        try{
            ogrenci.notekle(90);
            ogrenci.notekle(105);
        }
        catch (BuyukdegerException e){
            System.err.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        try{
            ogrenci.notekle(90);
            ogrenci.notekle(-10);
        }
        catch (KucukdegerException e){
            System.err.println(e.getMessage());
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

        System.out.println(System.currentTimeMillis());
        zaman();
        double x=156775.54662;
        float v=(float)x/8;
        System.out.println(v);
        char c=97;
        int a=(int) c;
        System.out.println(c+a);



    }
    //1970 yılından bu yana saniye cinsinden zamanı verir
    // bu metot ile zamanı saat : dakika : saniye cinsinden veriyor.
    public static void zaman(){
        long saat=System.currentTimeMillis()/1000/3600;
        int dakika=(int)System.currentTimeMillis()/1000/60%60;
        int saniye=(int)System.currentTimeMillis()/1000%60;
        System.out.println(saat+" : "+dakika+" : "+saniye);
    }
}