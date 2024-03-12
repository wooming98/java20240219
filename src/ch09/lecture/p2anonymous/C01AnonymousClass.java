package ch09.lecture.p2anonymous;


public class C01AnonymousClass {
    public static void main(String[] args) {

        // C01MyClass obj = new C01MyClass(); (x)
        // C01MyClass obj = new C01Child();
        //  익명클래스의 객체
        C01MyClass obj = new C01MyClass() {};

    }
}

// 추상 클래스는 객체를 만드려면 상속받는 클래스를 만들어 객체를 만들어야함
// 익명 클래스로 상속받는 클래스를 건너뜀
abstract class C01MyClass { }
class C01Child extends C01MyClass { }