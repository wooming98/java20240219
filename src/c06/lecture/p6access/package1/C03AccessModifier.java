package c06.lecture.p6access.package1;

import c06.lecture.p6access.C01MyClass;

public class C03AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30; // public
        // o1.name = "hwang"; (x) package private
        // o1.address = "seoul"; (x) private
    }
}
