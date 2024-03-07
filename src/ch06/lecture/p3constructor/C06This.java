package ch06.lecture.p3constructor;

public class C06This {
    public static void main(String[] args) {
        C06MyClass o1 = new C06MyClass("son");
        System.out.println(o1.name);

        C06MyClass o2 = new C06MyClass("lee");
        System.out.println(o2.name);
    }
}

class C06MyClass {
    String name;

    // this : 현재 객체의 참조값
    C06MyClass(String name) {
        this.name = name;
    }
}