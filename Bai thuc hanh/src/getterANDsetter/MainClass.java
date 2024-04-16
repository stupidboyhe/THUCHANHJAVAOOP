package getterANDsetter;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.setBanKinh(5);
        float cv = ht.tinhcv();
        float dt = ht.tinhdt();
        System.out.println("Chu vi hinh tron: "+cv+"\nDien tich hinh tron: "+dt);
    }
}