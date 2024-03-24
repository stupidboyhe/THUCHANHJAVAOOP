package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTronn{
    public float chieuCao;
    public HinhTru(){
        ten = "Hinh tru";
    }

    public void nhapchieucao(){
        nhapbankinh();  
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu cao= ");
        chieuCao=sc.nextFloat();
    }

    public void tinhthetich(){
        tinhdientich();
        theTich = dienTich*chieuCao;
    }
}