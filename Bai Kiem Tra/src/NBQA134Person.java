import java.util.Scanner;

public class NBQA134Person {
    public String HoTen;
    public int Tuoi;
    public String DiaChi;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Tuoi = sc.nextInt();
    }

    public void xuatThongTin(){
        System.out.println("Ho ten: " + HoTen);
        System.out.println("Dia Chi: " + DiaChi);
        System.out.println("Tuoi: " + Tuoi);
    }
    
    public NBQA134Person(){
        HoTen = "Nguyen Van A";
        DiaChi = "Thai Binh";
        Tuoi = 18;
    }
}