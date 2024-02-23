package c04;

public class C06Switch {
    public static void main(String[] args) {

        System.out.println("statement 1");

        String city = "제주";

            switch(city) {
                // 값이 "서울"
                case "서울":
                    System.out.println("statement 2");
                    // 값이 "제주"
                case "제주":
                    System.out.println("statement 3");
                    // 값이 "부산"
                case "부산":
                    System.out.println("statement 4");
            }
        System.out.println("statement 5");
        System.out.println("statement 6");
        System.out.println("statement 7");
    }

}
