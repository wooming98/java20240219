package ch07.lecture.p3casting;

import java.sql.SQLOutput;

public class C04InstanceOf {
    public static void main(String[] args) {
        // instancof : 연산자
        // 피연산자 갯수 : 2개
        // 왼쪽항 : 참조변수
        // 오른쪽항 : Type(Class, Instance)
        // 연산결과 : boolean (true / false)

        C04Tiger tiger = new C04Tiger();
        C04Animal animal = tiger;

        boolean b1 = animal instanceof C04Cat; // false
        System.out.println("b1 = " + b1);
        boolean b2 = animal instanceof C04Tiger;
        System.out.println("b2 = " + b2);
        boolean b3 = animal instanceof C04Animal;
        System.out.println("b3 = " + b3);

        if (animal instanceof C04Cat) {
            C04Cat cat = (C04Cat) animal;
            cat.meow();
        }

        if(animal instanceof C04Cat cat) {
            cat.meow();
        }
        System.out.println("프로그램 종료");
    }
}

class C04Animal {

}

class C04Tiger extends C04Animal {
    public void roar() {
        System.out.println("어흥");
    }
}

class C04Cat extends C04Animal {
    public void meow() {
        System.out.println("야옹");
    }
}