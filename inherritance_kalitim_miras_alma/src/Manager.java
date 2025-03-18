public class Manager extends Employee{
    int num_of_emplooye;//üst sınıftan miras almadığımız bir ksım ekledik

    public Manager(String name,int salary,String departman,int num_of_emplooye){
        super(name,salary,departman);//inheritans'ın en önemli anahtar kelimesi
        this.num_of_emplooye=num_of_emplooye;//constractora miras almadığımız kısmı ekliyoruz

        //bir üst sınıftan miras aldık extends anahtar kelimesiyle
        //bir üst sınıftan sadece fieldları almadık aynı zamanda metotları da miras aldık
    }
    //

    //override aslında üst sınıfın metodunu alıp onu modifiye etmemize yarar
    //aslında bu kadar basit bir olaydır
    @Override
    public void info() {
        super.info();//copy paste yapmamızı engellemek için böyle bir yazım var
        //ama copy paste de tapılabilir bir mahsuru yoktur
        System.out.println(this.num_of_emplooye);
        //üst satırda ise güncellediğimiz fonk eklediğimiz bir metin var
        //ama bir üst sınıfta num_of_employe ifadesini bastırmıyordu fonksiyon
    }

    public void risesalary(int amount){
        System.out.println("çalışanlara "+ amount+" ₺ kadar zam yapıldı");
    }
}
