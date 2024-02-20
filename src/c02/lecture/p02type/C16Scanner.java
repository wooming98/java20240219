package c02.lecture.p02type;

import java.util.Scanner;

public class C16Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int random = (int)(Math.random() * 10) + 1;
        
        if(num == random) {
            System.out.println(num + ", " + random);
            System.out.println("맞추기성공");
        } else {
            System.out.println(num + ", " + random);
            System.out.println("맞추기실패");
        }
        scanner.close();
    }
}
