public class mainTron {
    public static void main(String[] args) {
        tron t = new tron();
        t.nhapBK();
        if (t.VongTronLon()) {
            System.out.print("Hinh tron co ban kinh " +t.getBanKinh());
        } else {
            float chuvi = t.tinhChuVi();
            System.out.print("Chu vi hinh tron: "+chuvi);
        }
    }
}
