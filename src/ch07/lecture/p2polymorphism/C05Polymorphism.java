package ch07.lecture.p2polymorphism;

public class C05Polymorphism {
    A a;
    C05Polymorphism() {
        a = new A(); // ok
        a = new B(); // ok
        a = new C(); // ok
    }

    public static void main(String[] args) {
        // 지역변수
        A a = new A();
        a = new B();
        a = new C();

    }
}

class A {
    public void method1() {
        System.out.println("A.method1");
    }
}

class B extends A {
    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {
    @Override
    public void method1() {
        System.out.println("C.method1");
    }
}

