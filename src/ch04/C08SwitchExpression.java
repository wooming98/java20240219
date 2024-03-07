package ch04;

public class C08SwitchExpression {
    public static void main(String[] args) {
        // switch expression : java 12부터

        int value = 2;
        switch(value) {
            case 1, 2 -> System.out.println("1번이오");
            case 3 -> System.out.println("3번이오");
            case 4 -> {
                // 여러 명령문이 존재하면 { } 사용
                System.out.println("4번이오 - 1");
                System.out.println("4번이오 - 2");
            }
        }
    }
}
