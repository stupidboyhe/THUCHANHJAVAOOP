import java.util.Scanner;

public class SinhVienn {
    public int msv;
    public String hoten;
    public String lop;

    public void nhapHoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        hoten = sc.nextLine();
    }

    public void nhapLop(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
    }

    public void nhapMSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        msv = sc.nextInt();
    }

    public void Inthongtin(){
        System.out.println("Ho va ten: " + hoten);
        System.out.println("Lop: " + lop);
        System.out.println("Ma sinh vien: " + msv);
        System.out.println("-------------------");
    }
}