import java.util.Scanner;

public class mainToadohinhtron {
    public static void main(String[] args) {
        toadohinhtron td = new toadohinhtron();
        System.out.print("Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        float bk = sc.nextFloat();
        td.setBanKinh(bk);

        System.out.println("Hay nhap vao toa do hinh tron: ");
        System.out.print("x= ");
        int x = sc.nextInt();

        System.out.print("y= ");
        int y = sc.nextInt();

        td.setToaDo(x, y);

        td.xuatBanKinh();
        td.xuatToaDo();
    }
}