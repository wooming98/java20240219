package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char
        // 2byte == 16bit

        char a = 99;
        char b = 120;
        char c = 65535;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        char d = 0x2042;
        System.out.println("d = " + d);

        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

    }
}
