package ch16.lecture.p1lambda;

public class C08Lambda {
    public static void main(String[] args) {
        // 괄호생략은 매개변수가 하나일 때만 가능
        C08MyInterface obj = () -> {
                System.out.println("C08Lambda.method");
                System.out.println("C08Lambda.method");
        };

        C08MyInterface obj2 = () -> System.out.println("hello");
    }
}

// 매개변수가 없고 리턴이 없는 추상 메소드
@FunctionalInterface
interface C08MyInterface {
    void method();
}
