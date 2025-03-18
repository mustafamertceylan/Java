
class Otomobil extends Arac {
    int silindirHacmi;

    public Otomobil(String marka, String model, int maliyet, int uretimYili, int silindirHacmi) {
        super(marka, model, maliyet, uretimYili);
        this.silindirHacmi = silindirHacmi;
    }


    public int satisFiyatiHesapla() {
        return maliyet + (uretimYili * 2) + (silindirHacmi * 3);
    }
}