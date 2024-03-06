package c06.lecture.p6access;

public class C02AccessModifer {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30; // public
        o1.name = "lee"; // package private
        // o1.address = "seoul"; (x) // private
    }
}
