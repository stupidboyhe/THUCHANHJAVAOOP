package people;

public class employee extends person{
    public float luong;
    public void nhapThongTin(String ten, String diachi, int tuoi){
        HoTen = ten;
        DiaChi = diachi;
        Tuoi = tuoi;
    }

    public float inLuong(){   
        System.out.println("Luong: "+luong+"vnd");
        return luong;
    }
}