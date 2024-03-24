package main;

import shapes.HinhChuNhatt;
import shapes.HinhTronn;
import shapes.HinhTru;
import shapes.HinhVuong;

public class Main4hinh {
    public static void main(String[] args) {
        HinhTronn hTronn = new HinhTronn();
        hTronn.xuatTen();
        hTronn.nhapbankinh();
        hTronn.tinhchuvi();
        hTronn.tinhdientich();
        hTronn.inchuvi();
        hTronn.indientich();

        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapchieucao();
        hinhTru.tinhthetich();
        hinhTru.inthetich();

        HinhChuNhatt hinhChuNhatt = new HinhChuNhatt();
        hinhChuNhatt.xuatTen();
        hinhChuNhatt.nhapdai();
        hinhChuNhatt.nhaprong();
        hinhChuNhatt.tinhchuvi();
        hinhChuNhatt.tinhdientich();
        hinhChuNhatt.inchuvi();
        hinhChuNhatt.indientich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapcanh();
        hinhVuong.tinhchuvi();
        hinhVuong.tinhdientich();
        hinhVuong.inchuvi();
        hinhVuong.indientich();
    }
}