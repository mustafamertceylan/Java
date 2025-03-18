public class Daire extends Alan{
    private int yaricap;
    final double Pi=3.14;
    Daire(int yaricap){
        this.yaricap=yaricap;
    }
    public int getYaricap(){
        return yaricap;
    }
    public void setYaricap(int yaricap){
        this.yaricap=yaricap;
    }




    @Override
    public void alanHesabi(){
        double alan=0;
        try{
            if(yaricap<0){
                throw new AlanHatasi("Alan negatif olarak hesaplandı yarıçapı kontrol ediniz");
            }
            alan=yaricap*yaricap*Pi;
            System.out.println("alan hesaplanıyor...");
            System.out.println("alan : "+alan);
        }
        catch(AlanHatasi e){
            System.err.println("hata alan negatif olamaz");
        }
    }
}
