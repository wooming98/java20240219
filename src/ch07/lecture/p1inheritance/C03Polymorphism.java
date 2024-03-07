package ch07.lecture.p1inheritance;

public class C03Polymorphism {
    public static void main(String[] args) {
        // 다형성
        C03Parent child1 = new C03Child1();
        C03Parent child2 = new C03Child2();
    }
}

class C03Parent {

}

class C03Child1 extends C03Parent {

}

class C03Child2 extends C03Parent {

}

