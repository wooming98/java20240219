package ch15.lecture.p2set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("css");

        // 향상된 for
        System.out.println("### 향상된 for 사용 ###");
        for(String item : set) {
            System.out.println(item);
        }

        // forEach
        System.out.println("### forEach 사용 ###");
        set.forEach(e -> System.out.println(e));

        // Iterator 사용
        // hashNext : 탐색할 아이템이 있는지? boolean
        // next : 다음 아이템 리턴
        System.out.println("### Iterator 사용 ###");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
