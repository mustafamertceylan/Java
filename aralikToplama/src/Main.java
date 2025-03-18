
public class Main {
    public static void main(String[] args) {

        int sum=aralikTopla(10,20);
        System.out.println(sum);

    }


    public static int aralikTopla(int a,int b){
        int toplam=0;
        for(int i=a;i<=b;i++){
           toplam+=i;
           a+=1;
        }
        return toplam;
    }
}