import java.util.Scanner;

public class hinhtron {
public float banKinh;
    public float chuVi;
    public float dienTich;
    public final float Pi = 3.14f;

    public void nhapBanKinh (){
        Scanner sc = new Scanner(System.in);
        System.out.print("R= ");
        banKinh = sc.nextFloat();
    }

    public void tinhcv (){
        chuVi = 2 * Pi * banKinh;
    }

    public void tinhdt(){
        dienTich = Pi * banKinh * banKinh;
    }

    public void hiencv (){
        System.out.println("Chu vi hinh tron la: " + chuVi);
    }

    public void hiendt(){
        System.out.println("Dien tich hinh tron la: "+dienTich);
    }
}