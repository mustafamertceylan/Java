import java.util.ArrayList;

class Bayi {
    String ad;
    int kurulusYili;
    int uretilenAracSayisi;
    ArrayList<Arac> araclar;

    public Bayi(String ad, int kurulusYili, int uretilenAracSayisi) {
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        this.uretilenAracSayisi = uretilenAracSayisi;
        this.araclar = new ArrayList<>();
    }

    public void aracEkle(Arac arac) {
        araclar.add(arac);
        System.out.println(arac.marka + " " + arac.model + " arac bayiye eklendi.");
    }

    public void aracSat(Arac arac, Kullanici kullanici) {
        if (araclar.contains(arac)) {
            araclar.remove(arac);
            arac.kullanici = kullanici;
            kullanici.satinAlinanlar.add(arac);
            kullanici.aracSayisi++;
            System.out.println(arac.marka + " " + arac.model + " " + kullanici.ad + " " + kullanici.soyad + "  adlı kisi almıstır.");
        } else {
            System.out.println("bu arac bayide yoktur.");
        }
    }
}