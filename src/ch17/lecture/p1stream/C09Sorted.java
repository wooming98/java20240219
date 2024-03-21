package ch17.lecture.p1stream;

import java.util.List;

public class C09Sorted {
    public static void main(String[] args) {
        // sorted : 정렬된 stream 리턴
        List<Integer> list = List.of(9, 7, 3, 10, 3, 6, 5, 7, 1);

        list.stream()
                .sorted()
                .forEach(e -> System.out.println(e));

        System.out.println();
        list.stream()
                .distinct()
                .sorted()
                .forEach(e -> System.out.println(e));

        System.out.println();
        List<String> list1 = List.of("java", "css", "react", "html", "vue");
        list1.stream()
                .sorted()
                .forEach(e -> System.out.println(e));

        System.out.println();
        list1.stream()
                .map(e -> e.length())
                .sorted()
                .forEach(e -> System.out.println(e));

    }
}
