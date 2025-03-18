public class Para extends Metot{
    private double para;

    public Para(double para){
        this.para=para;
    }

    public double getPara() {
        return para;
    }

    public void setPara(double para) {
        this.para = para;
    }

    @Override
    void hesapla() {
        int tamKisim=(int)para;
        int dime=(int)((para%1)/0.1);
        int peni=(int)(((para%1))*100)%10;
        System.out.println("paranız "+tamKisim+" dolar "+dime+" dime "+peni+" peni etmekte ");


    }
}
