package ch06.lecture.p6access;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass obj1 = new C03MyClass();
        // obj1.name = "son";
        obj1.setName("son");
        // obj1.age = 27;
        obj1.setAge(27);

        // System.out.println(obj1.name);
        System.out.println(obj1.getName());
        // System.out.println(obj1.age);
        System.out.println(obj1.getAge());
    }

}

class C03MyClass {
    // 필드
    private String name;
    private int age;

    // 메소드 (getter 와 setter)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

