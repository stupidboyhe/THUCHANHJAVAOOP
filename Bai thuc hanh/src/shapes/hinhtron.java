package shapes;

import java.util.Scanner;

public class hinhtron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        r = sc.nextFloat();
    }
    
    public void tinhChuVi(){
        cv = 2 * PI * r;
    }

    public void tinhDienTich(){
        dt = PI * r * r;
    }

    public void inChuVi(){
        System.out.println("Chu vi hinh tron: "+cv);
    }

    public void inDienTich(){
        System.out.println("Dien tich hinh tron: "+cv);
    }
}