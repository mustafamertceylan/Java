public class Ogrenci extends DogumTarihi{
    public final int baslangicYili = 2024;
    private String isim;
    private int id;
    private static int sayac=0;

    Ogrenci(String isim,int id,int yil,int ay,int gun){
        this.isim=isim;
        this.id=id;
        super(yil,ay,gun);
        sayac+=1;
    }
    public void OgrenciKontrol(){
        if(baslangicYili-this.getYil()<18){
            System.out.println(isim+" kişisinin üniverste öğrencisi olup olmadığı kontrol ediliyor...");
            System.out.println("Üniverste öğrencisi değildir");
        }
        else{
            System.out.println(isim+" kişisinin üniverste öğrencisi olup olmadığı kontrol ediliyor...");
            System.out.println("Üniverste öğrencisidir");
        }
    }


}
