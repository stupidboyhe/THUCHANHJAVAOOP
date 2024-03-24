package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhatt{
    public HinhVuong(){
        ten = "Hinh vuong";
    }

    public void nhapcanh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Canh= ");
        dai = rong = sc.nextFloat();
    }
}