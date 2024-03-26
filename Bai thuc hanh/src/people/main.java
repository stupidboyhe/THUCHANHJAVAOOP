package people;

public class main {
    public static void main(String[] args) {
        person per = new person();
        per.xuatThongTin();
        per.nhapThongTin();
        per.xuatThongTin();

        employee em = new employee();
        em.nhapThongTin("Bui Van B", "Hai Phong", 19);
        em.xuatThongTin();
        
        employee_parttime emp = new employee_parttime();
        emp.so_gio_lam();
        emp.Luong_NV_PartTime();

        employee_fulltime emf = new employee_fulltime();
        emf.nhapLCB();
        emf.PhanTram_Doanhthu();
        emf.thuong();
        emf.Luong_FullTime();
    }
}
