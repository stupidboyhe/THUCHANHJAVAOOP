package Staticc;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    protected float banKinh;
    private Scanner sc;
    public HinhTron()
    {
        super();
        sc = new Scanner(System.in);
    }
    public void nhapBanKinh()
    {
        System.out.println("Ban dung don vi tinh nao: ");
        System.out.println("\t1 - centimet");
        System.out.println("\t2 - inch ");
        configs.donVi = sc.nextInt();
        System.out.println("Nhap vao ban kinh hinh tron ");
        banKinh=sc.nextFloat();
    }
    public void inThongtin()
    {
        if(configs.donVi == configs.DonVi_CM)
        {
            System.out.println("Hinh tron co ban kinh "+ banKinh + " cm");
            System.out.println("Tuong duong "+ configs.chuyenCMsangINCH(banKinh) + " inch");
        }
        else
        {
            System.out.println("Hinh tron co ban kinh "+ banKinh + " inch");
            System.out.println("Tuong duong "+ configs.chuyenINCHsangCM(banKinh) + " cm");
        }
    }
}