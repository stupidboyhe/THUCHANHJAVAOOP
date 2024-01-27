import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten;
        int nam, tuoi;
        System.out.print("Name: ");
        ten = sc.nextLine();
        System.out.print("Nam sinh: ");
        nam = sc. nextInt();
        tuoi = 2024 - nam;
        if (tuoi<16) System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        else if(tuoi >=16 && tuoi <18) System.out.println("Ban "+ten+" o do tuoi truong thanh");
        else System.out.println("Ban "+ten+" da gia");
    }
}
