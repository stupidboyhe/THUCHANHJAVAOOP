package overriding;

public class MainClass {
    public static void main(String[] args) {
        HinhTron ht =new HinhTron();
        HinhTru hTru = new HinhTru();

        ht.xuatThongTin();
        hTru.xuatThongTin();
    }
}