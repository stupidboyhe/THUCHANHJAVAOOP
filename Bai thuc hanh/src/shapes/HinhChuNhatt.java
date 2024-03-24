package shapes;

import java.util.Scanner;

public class HinhChuNhatt extends HinhHoc{
    public float dai;
    public float rong;

    public HinhChuNhatt(){
        ten = "Hinh Chu Nhat";
    }

    public void nhapdai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai= ");
        dai=sc.nextFloat();
    }

    public void nhaprong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu rong= ");
        rong=sc.nextFloat();
    }

    public void tinhchuvi(){
        chuVi = (dai+rong)*2;
    }

    public void tinhdientich(){
        dienTich = dai * rong;
    }
}