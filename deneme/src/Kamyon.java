
class Kamyon extends Arac {
    int toplamAgirlik;

    public Kamyon(String marka, String model, int maliyet, int uretimYili, int toplamAgirlik) {
        super(marka, model, maliyet, uretimYili);
        this.toplamAgirlik = toplamAgirlik;
    }


    public int satisFiyatiHesapla() {
        return maliyet + (uretimYili * 2) + (toplamAgirlik * 6);
    }
}