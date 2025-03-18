public class Tl extends Metot{
    private double para;

    public Tl(double para){
        this.para=para;
    }
    public double getPara(){
        return para;
    }
    public void setPara(double para){
        this.para=para;
    }
    @Override
    public void hesapla(){
        int tamKisim=(int)(para/1);
        int kurus=(int)((para%1)*100);
        System.out.println("paranız "+tamKisim+" tl "+kurus+" kuruştur");
    }


}
