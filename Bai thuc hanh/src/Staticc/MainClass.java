package Staticc;

public class MainClass {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo();
        td1.x = 10;
        td1.y = 20;

        ToaDo td2 = new ToaDo();
        td2.x = 4;
        td2.y = 5;

        ToaDo.thongTin = "Luu toa do cac hinh hoc";
    }
}