package ch02.lecture.p02type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C12String {
    public static void main(String[] args) {

        // var : 변수의 타입을 할당되는 값으로 추론
        // 변수의 선언과 할당을 동시에 해야함
        // 지역변수에서만 사용 가능 (필드, 파라미터, 리턴타입에 사용 불가능)

        List<Map<String, Integer>> list = new ArrayList<>();
        var list2 = new ArrayList<>();

    }
}
