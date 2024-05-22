import java.util.Scanner;

public class NBQA134Student extends NBQA134Person{
    public String diachi;

    @Override

    public void nhapThongTin (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dia chi nha: ");
        diachi = sc.nextLine();
    }
    public void xuatThongTin (){
        System.out.println("Dia chi nha: "+diachi);
    }
}