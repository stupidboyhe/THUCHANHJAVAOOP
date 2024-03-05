public class mainHinhtron {
    public static void main(String[] args) {
        
        System.out.println("Thong so hinh tron 1: ");
        hinhtron ht1 = new hinhtron();
        ht1.nhapBanKinh();
        ht1.tinhcv();
        ht1.hiencv();

        System.out.println("Thong so hinh tron 3: ");
        hinhtron ht3 = new hinhtron();
        ht3.nhapBanKinh();
        ht3.tinhdt();
        ht3.hiendt();
    }
}