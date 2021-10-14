package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> hihi = new ArrayList<>();
        hihi.add("haha");
        hihi.add("hehe");
        hihi.add("ihih");
        System.out.println("ArrayList");
        System.out.println(hihi.indexOf("hehe"));
        System.out.println(hihi.contains("haha"));
        hihi.add(1,"meow");
        hihi.set(3,"manime");
        System.out.println(hihi);
        hihi.remove(2);
        System.out.println(hihi.size());
        System.out.println(hihi);

        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println("LinkedList");
        System.out.println(list.indexOf("second"));
        System.out.println(hihi.contains("haha"));
        list.addLast("last");
        list.addFirst("first");
        System.out.println(list);
        list.pollFirst();
        System.out.println(list.size());
        System.out.println(list);


    }

}
