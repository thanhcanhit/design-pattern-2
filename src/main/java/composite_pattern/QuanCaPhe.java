package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class QuanCaPhe {
    public static void main(String[] args) {
        Component caphe1 = new Leaf(5);
        Component traSua1 = new Leaf(10);
        Component banh1 = new Leaf(15);

         List<Component> list = new ArrayList<>();
        list.add(caphe1);
        list.add(traSua1);
        list.add(banh1);

        Component ban1 = new Composite(list);
        System.out.println("Tong tien cua ban 1: " + ban1.tinhTien());

//        Ban 2

        Component caphe2 = new Leaf(20);
        Component traSua2 = new Leaf(10);
        Component banh2 = new Leaf(15);

        List<Component> list2 = new ArrayList<>();
        list2.add(caphe2);
        list2.add(traSua2);
        list2.add(banh2);

        Component ban2 = new Composite(list2);
        System.out.println("Tong tien cua ban 2: " + ban2.tinhTien());

//        Cua hang

        List<Component> list3 = new ArrayList<>();
        list3.add(ban1);
        list3.add(ban2);

        Component cuaHang = new Composite(list3);
        System.out.println("Tong tien cua cua hang: " + cuaHang.tinhTien());

    }
}
