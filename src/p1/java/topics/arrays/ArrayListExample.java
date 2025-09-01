package p1.java.topics.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
        arrayList.set(0, 5);
        System.out.println(arrayList);
        arrayList.add(2, 74);
        System.out.println(arrayList);

    }
}
