import java.util.ArrayList;

public class Ogrenci {
    ArrayList<Integer> notlar= new ArrayList<>();

    public void notekle(int not) throws KucukdegerException ,BuyukdegerException{

        if(not>100){
            throw new BuyukdegerException("gecersiz not...");
        } else if (not<0) {
            throw new KucukdegerException("gecersiz not...");

        }
        else {
            notlar.add(not);
            System.out.println("not başarıyla eklendi");
        }

    }
}
