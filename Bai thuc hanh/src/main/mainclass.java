package main;

import shapes.hinhchunhat;
import shapes.hinhtron;

public class mainclass {
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        hinhchunhat hcn = new hinhchunhat();

        System.out.println("Nhap thong tin hinh tron: ");
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        System.out.println("\n");

        System.out.println("Nhap thong tin hinh chu nhat:");
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.incv();
        hcn.indt();
    }
}