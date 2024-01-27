import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0, so;
        String str ="";
        while (s<=100) {
            System.out.print("Nhap 1 so di: ");
            so=sc.nextInt(); 
            s=s+so;
            str=str+so+ " + ";                     
             }
             str = str.substring(0, str.length()-3);
             System.out.print("Tong cua cac so la: "+ str + " = "+s);  
    }
}   