import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n, gt = 1;
            System.out.print("Nhap 1 so nguyen duong: ");
        do {
             n = sc.nextInt();
        } while (n < 0);
        for(int i = 1; i <= n; i++)
        {
            gt = gt*i;
        }
        System.out.print("Giai thua cua "+n+" la: "+ gt);
    }
}