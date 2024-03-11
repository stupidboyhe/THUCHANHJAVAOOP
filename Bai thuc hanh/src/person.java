import java.util.Scanner;

public class person {
    public String ten;
    public int tuoi;
    public String diachi;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diachi = sc.nextLine();
    }
    public void xuatthongtin(){
        System.out.println(ten+", "+tuoi+" tuoi. Dia chi nha: "+diachi+"\n");
    }

    public person(){
        this.ten = "Nguyen Van A";
        this.tuoi = 20;
        this.diachi = "JQKA";
    }
    
    public void nhapthongtin(String ten, int tuoi, String diachi){
        this.ten = ten;
        this.tuoi = tuoi; 
        this.diachi = diachi;
    }
}