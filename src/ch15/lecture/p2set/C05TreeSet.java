package ch15.lecture.p2set;

import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        // TreeSet
        // Comparator 또는 Comparable(natural ordering)을
        // 사용해 원소(element)의 순서가 결정됨

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(20); // false

        System.out.println(set.size()); // 4
        System.out.println(set);

        for(int item : set) {
            System.out.println(item);
        }
    }
}
