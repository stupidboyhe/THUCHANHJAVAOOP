package arrayList;

import java.util.ArrayList;

import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList <Float> arr = new ArrayList<>();

        arr.add(0.7f);
        arr.add(7.26f);
        arr.add(1.02f);
        arr.add(9.3f);

        Iterator <Float> iter = arr.iterator();
        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "\t");
        }
    }
}
