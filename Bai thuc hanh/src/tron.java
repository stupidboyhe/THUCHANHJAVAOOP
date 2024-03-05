import java.util.Scanner;

public class tron {
    public final float PI = 3.14f;
    public float r;
    public float cv;
    public float dt;
    
    public void nhapBK() { 
        System.out.print("Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat(); 
        sc.close(); 
    }

    public void tinhDienTich(){
        cv = PI*r*r;
    } 
    
    public float getBanKinh(){
        return r;
    }

    public float tinhChuVi(){
        cv = 2*PI*r;
        return cv;
    }

    public boolean VongTronLon(){
        if(r>10){
            return true;
        }
        else{ 
            return false;
        }
    }

}