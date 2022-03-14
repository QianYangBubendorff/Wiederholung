package fh.campus02;

public class Heruntergezaehlt {
    public static void main(String[] args) {
        herunterzaehlen(15, 11);
    }

    public static void herunterzaehlen(int startNumber, int endNumber) {
        if (startNumber>0 && startNumber >= endNumber) {
            System.out.println(startNumber);
            herunterzaehlen(startNumber-1, endNumber);
        }
        else System.out.println("Ende!");
    }
}
