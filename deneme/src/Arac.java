
abstract class Arac {
    String marka;
    String model;
    int maliyet;
    int uretimYili;
    Kullanici kullanici;

    public Arac(String marka, String model, int maliyet, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.maliyet = maliyet;
        this.uretimYili = uretimYili;
    }

    public abstract int satisFiyatiHesapla();
}