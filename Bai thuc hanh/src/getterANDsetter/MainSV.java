package getterANDsetter;

public class MainSV {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.setTen("");
        sv1.setTuoi(20);

        sv2.setTen("QA");
        sv2.setTuoi(15);

        System.out.println("Sinh vien 1 co ten: "+sv1.getTen()+", tuoi: "+sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten: "+sv2.getTen()+", tuoi: "+sv2.getTuoi());
    }
}
