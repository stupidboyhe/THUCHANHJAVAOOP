import java.util.Scanner;

public class bai_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, tong, hieu, tich, thuong, du;
       
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
       
        tong = a+b;
        hieu = a-b;
        tich = a*b;
       
        System.out.println("Tong cua 2 so la: " +tong);
        System.out.println("Hieu cua 2 so la: " +hieu);
        System.out.println("Tich cua 2 so la: " +tich);
       
        thuong = a/b;
        if (b==0) System.out.println("Phep chia khong hop le");
        else System.out.println("Thuong cua 2 so la: " +thuong);
       
        du = a%b;
        if (b==0) System.out.println("Phep chia lay du khong hop le");
        else System.out.println("Phep chia lay du cua 2 so la: " +du);
        if (a==b) System.out.println("Hai so bang nhau");
        else if (a>b) System.out.println(a+" lon hon "+b);
            else System.out.println(a+" nho hon "+b);
    }
}