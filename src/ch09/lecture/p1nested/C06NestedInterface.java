package ch09.lecture.p1nested;

public class C06NestedInterface {
}

class C06OtherClass implements C06MyClass.C06NestedInterface {

    @Override
    public void someMethod() {

    }
}

class C06MyClass {
    interface C06NestedInterface {
        void someMethod();
    }
    // 중첩 클래스, 인터페이스
    // 필드, 생성자, 메소드
    void method1() {
        class LocalClass implements C06NestedInterface {
            @Override
            public void someMethod() {
                System.out.println("인터페이스의 메소드 재정의");
            }
        }
    }
}
