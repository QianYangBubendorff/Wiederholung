package fh.campus02;

import java.util.Locale;

public class Nulltest {
    public static void main(String[] args) {
        String hansisLieblingsPizza = null;
//        hansisLieblingsPizza.indexOf("a");
//       sobald wir ein objekt zuweisen ist es kein Problem mehr und geht ganz normal
        hansisLieblingsPizza = "Margherita";
        System.out.println(hansisLieblingsPizza);
        System.out.println(hansisLieblingsPizza.toUpperCase());
    }
}
