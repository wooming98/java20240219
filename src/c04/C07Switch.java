package c04;

public class C07Switch {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 6) + 1;

        switch(num) {
            case 1:
                System.out.println("1번이오");
                break;
            case 2:
                System.out.println("2번이오");
                break;
            case 3:
                System.out.println("3번이오");
                break;
            case 4:
                System.out.println("4번이오");
                break;
            case 5:
                System.out.println("5번이오");
                break;
            case 6:
                System.out.println("6번이오");
                break;
        }
    }
}
