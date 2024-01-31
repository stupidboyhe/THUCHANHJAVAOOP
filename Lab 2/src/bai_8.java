import java.util.Scanner;

public class bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , soNguyen, s = 0;
        System.out.print("Nhap so so nguyen: ");
        n = sc.nextInt();
        for( int i = 0; i < n; i++)
        {
            System.out.print("Nhap so thu " + (i+1) + " : ");
            soNguyen = sc.nextInt();
            s = s + soNguyen;
        }
        float tbc = (float) s/n;
        System.out.println("Trung binh cong cua cac so nguyen tren là: "+ tbc);
    }
}