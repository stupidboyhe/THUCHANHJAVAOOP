package shapes;

import java.util.Scanner;

public class HinhTronn extends HinhHoc{
    public float banKinh;
    public HinhTronn(){
        ten = "Hinh Tron";
    }

    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh= ");
        banKinh = sc.nextFloat();
    }

    public void tinhchuvi(){
        chuVi =  2*PI*banKinh;
    }

    public void tinhdientich(){
        dienTich = PI*banKinh*banKinh;
    }
}