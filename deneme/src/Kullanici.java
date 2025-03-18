import java.util.ArrayList;


class Kullanici {
    String ad;
    String soyad;
    int aracSayisi;
    ArrayList<Arac> satinAlinanlar;

    public Kullanici(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.aracSayisi = 0;
        this.satinAlinanlar = new ArrayList<>();
    }

    public void satinAlinanlariListele() {
        System.out.println(ad + " " + soyad + " tarafından satın alınan araçlar:");
        for (Arac arac : satinAlinanlar) {
            System.out.println("Marka: " + arac.marka + ", Model: " + arac.model + ", Satış Fiyatı: " + arac.satisFiyatiHesapla());
        }
    }
}
