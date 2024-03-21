package ch15.lecture.p6of;

import java.util.Map;

public class C03Map {
    public static void main(String[] args) {
        // 짝수 개로 넣어야 함
        Map<String, String> map1 = Map.of("css", "style sheets", 
                "spring", "framework", 
                "java", "language",
                "react", "library");

        System.out.println(map1);
    }
}
