package ch16.lecture.p1lambda;

public class C05Sample {
    public static void main(String[] args) {
        // TODO : null이 있는 곳에 lambda로 코드 작성하기
        C05MyInterface obj1 = (a, b) -> {
            System.out.println(5 / 3);
        };
        C05MyInterface obj2 = (a, b) -> {
            System.out.println(5 % 3);
        };
        obj1.method(5, 3); // 5를 3으로 나눈 몫 출력
        obj2.method(5, 3); // 5를 3으로 나눈 후의 나머지 출력
    }
}

@FunctionalInterface
interface C05MyInterface {
    void method(int a, int b);
}