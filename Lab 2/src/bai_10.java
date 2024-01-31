import java.util.Scanner;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kyTu;
        do {
            System.out.print("Nhap vao 1 chuoi (khong qua 80 ky tu): ");
            chuoi = sc.nextLine();
            
        } while (chuoi.length() > 80);
        System.out.print("Nhap 1 ky tu can dem: ");
        kyTu = sc.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu '" + kyTu + "' trong chuoi la: " + dem);
    }
}