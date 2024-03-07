package ch02.lecture.p02type;

import java.util.Scanner;

public class C25Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int z = Integer.parseInt(str);

        int x = scanner.nextInt();

        int y = 3;

        System.out.println(x + y);
        System.out.println(z + y);
    }
}