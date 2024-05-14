package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ds = new LinkedList<>();
        ds.add("Thang 1");
        ds.add("Thang 2");
        ds.add("Thang 3");
        ds.add("Thang 4");
        ds.add("Thang 5");
        ds.add("Thang 6");
        ds.add("Thang 7");
        ds.add("Thang 8");
        ds.add("Thang 9");
        ds.add("Thang 10");
        ds.add("Thang 11");
        ds.add("Thang 12");
        System.out.print("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();
        if((index < 0) || (index > ds.size()-1)){
            System.out.println("Chi so can lay phai lon hon 0 va nho hon "+ (ds.size()-1)) ;
        }
        else{
            String node = ds.get(index);
            System.out.println("Phan tu co chi so = "+ index + " trong list la " + node);
            String firstnode = ds.getFirst();
            String lastnode = ds.getLast();
            System.out.println("Phan tu dau tien trong danh sach la "+ firstnode + " ; Phan tu cuoi cung trong danh sach la "+ lastnode);
        }
    }
}