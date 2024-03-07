package ch04;

public class forPractice {
    public static void main(String[] args) {
        // 1번
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }

        System.out.println();

        // 2번
        for(int i=1; i<6; i++) {
            System.out.println(i);
        }

        System.out.println();

        // 3번
        for(int i=0; i<=8; i+=2) {
            System.out.println(i);
        }

        System.out.println();

        // 4번
        for(int i=2; i<=10; i+=2) {
            System.out.println(i);
        }

        System.out.println();

        // 5번
        for(int i=4; i>=0; i--) {
            System.out.println(i);
        }

        System.out.println();

        // 6번
        for(int i=5; i>=1; i--) {
            System.out.println(i);
        }

        System.out.println();

        // 7번
        for(int i=0; i<5; i++) {
            System.out.println("*");
        }

        System.out.println();

        // 8번
        for(int i=0; i<5; i++) {
            System.out.println("*****");
        }

        System.out.println();

        // 9번
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 10번
        for(int i=0; i<5; i++) {
            for(int j=5; i<j; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 11번
        for(int i=0; i<6; i++) {
            for(int j=0; j<(5-i); j++) {
                System.out.print("*");
            }
            for(int k=0; k<i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        // 12번
        for(int i=0; i<5; i++) {
            for(int j=0; j<(5-i); j++) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 13번
        for(int i=0; i<5; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<(5-i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 14번
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        // 15번
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        System.out.println();
        
        // 16번
        int k = 0;
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(k % 10);
                k++;
            }
            System.out.println();
        }

        System.out.println();

        // 17번
        k = 1;
        for(int i=0; i<5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(k % 10);
                k++;
            }
            System.out.println();
        }
    }
}
