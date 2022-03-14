package fh.campus02;

import java.util.Arrays;
import java.util.Locale;

public class ArrayTest {
    public static void main(String[] args) {
        String[] quartale = {"Spring", "Summer", "Autumn", "Winter"};
        String qu1 = quartale[0];
        String qu2 = qu1.toUpperCase(Locale.ROOT);
        // Arrays.toString function to print out the elements of an Array.
        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);
        quartale[0] = "Free";
        System.out.println(Arrays.toString(quartale));
        // change the string value.
        qu1 = quartale[0];
        System.out.println(qu1);


        int[][] tabelle = new int[4][3];
        // value should be set to number 7.
        // the loop for the lines.
        for(int zeile =0; zeile < tabelle.length; ++zeile){
            // the loop for the columns.
            for(int spalte=0; spalte<tabelle[zeile].length; ++spalte){
                tabelle[zeile][spalte] = 7;
            }
        }
    }
}
