package arrayList;

import java.util.ArrayList;

public class vongFor {
    public static void main(String[] args) {
    ArrayList <String> arlist =new ArrayList<>();

    arlist.add("JAVA");
    arlist.add("PHP");
    arlist.add("C#");
    arlist.add("C++");

    System.out.println("Cac phan tu co trong array list la: ");
    for (int i = 0; i < arlist.size(); i++) {
        System.out.println( arlist.get(i) + "\t");
    }
    }
}