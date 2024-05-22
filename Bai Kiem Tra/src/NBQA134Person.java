import java.util.Scanner;

public class NBQA134Person {
    public String HoTen;
    public int Tuoi;
    public double Cao;

    public void nhapThongTin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap chieu cao: ");
        Cao = sc.nextDouble();
        System.out.print("Nhap tuoi: ");
        Tuoi = sc.nextInt();
    }

    public void xuatThongTin(){
        System.out.println("Ho ten: " + HoTen);
        System.out.println("Chieu cao: " + Cao);
        System.out.println("Tuoi: " + Tuoi);
    }
}