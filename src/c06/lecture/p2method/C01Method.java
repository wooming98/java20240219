package c06.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk();
        person2.walk();

    }
}

class C01Person {
    String name;

    // 기능(메소드)
    void walk() {
        // 메소드가 실행하는 코드들
        // 변수, 연산자, 제어문
        System.out.println("걷습니다.");
    }
}
