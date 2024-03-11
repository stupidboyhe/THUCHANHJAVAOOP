package shapes;

import java.util.Scanner;

public class hinhchunhat {
    float dai;
    float rong;
    float cv;
    float dt;

    public void nhapChieuDai(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
    }

    public void nhapChieuRong(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }

    public void tinhChuVi(){
        cv = 2*(dai +rong);
    }

    public void tinhDienTich(){
        dt = dai * rong;
    }

    public void incv(){
        System.out.println("Chu vi hcn: " +cv);
    }

    public void indt(){
        System.out.println("Dien tich hcn: "+dt);
    }
}
