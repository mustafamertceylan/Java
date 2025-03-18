public class Cars {
    private String colors;
    private int doors;
    private String model;

////
//    public String getColors() {
//        return colors;
//    }
//
//    public void setColors(String colors) {
//        this.colors = colors;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public void setDoors(int doors) {
//        if (doors == 2 || doors == 4) {
//            this.doors = doors;
//        } else {
//            System.out.println("kapı sayısı olarak yalnızca 2 veya 4 girilebilir");
//        }
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//
    /*bu kodlar yerine constractor tanımlamak çok daha mantıklıdır
        *ayrıca constractorslarda overloading yapılabilir
     */
    public Cars(String colors,int doors,String model){
        this.colors=colors;
        this.doors=doors;
        this.model=model;
    }
    public Cars(String colors,String model){
        this.colors=colors;
        this.model=model;
        this.doors=0;
    }

    //ekrana bu bilgileri yazdırmak içinde bir metot tanımla sonuç olarak fieldlar private olarak tanımlanmış
    public void showInfos(){
        System.out.println("arabanın reengi "+this.colors);
        System.out.println("arabanın modeli "+this.model);
        System.out.println("arabanın kapı sayısı "+this.doors);
        System.out.println();
    }

}
