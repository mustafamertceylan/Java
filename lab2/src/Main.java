//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ogrenci_bilgileri deneme=new ogrenci_bilgileri();
    ogrenci_islemleri deneme_islemleri=new ogrenci_islemleri();
    deneme.ad=deneme_islemleri.ekleme();
    System.out.println(deneme.ad+deneme.num+deneme.tc+deneme.ogrenci_yas);

    }
}
