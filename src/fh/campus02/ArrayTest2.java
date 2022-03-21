package fh.campus02;


import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
//        for loop to print a string array.
        String[] smartphoneNamen = {"Samsung A51", "iPhone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7T"};
//        each line stands for one phone, each column in the line stands for the sales number in each quarter.
        int[][] smartphoneVerkaufszahlen = {{2000, 3000, 4000, 1000}, {5000, 2000, 7000, 1500}, {2000, 3000, 4000, 1000}, {2100, 3020, 4000, 1000}, {2500, 3500, 4010, 1500}};
        for (int sNr = 0; sNr < smartphoneNamen.length; ++sNr) {
            System.out.println(smartphoneNamen[sNr]);
        }
//        for each loop to get info from the data without changing the data.
        for (String smarpthone : smartphoneNamen) {
            System.out.println(smarpthone);
        }
//        print out the double dimensional array.
        for (int sIndex = 0; sIndex < smartphoneVerkaufszahlen.length; ++sIndex) {
            System.out.print(smartphoneNamen[sIndex] + ": ");
            for (int qIndex = 0; qIndex < smartphoneVerkaufszahlen[sIndex].length; ++qIndex) {
                System.out.print(smartphoneVerkaufszahlen[sIndex][qIndex] + " ");
            }
//            a line break after each printed line.

        }

        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 2));
        System.out.println();
//        System.out.println(Arrays.toString(smartphoneHighestSale(smartphoneVerkaufszahlen,smartphoneNamen)));
        System.out.println(bestSalePhone(smartphoneVerkaufszahlen, smartphoneNamen, 0));
    }

    //    the following method should return the annual sales of each smartphone model. Sales numbers are based on the double dimensional array. The index of the phone based on the array of smartphone name
//    invalid value of index number returns -1.
    public static int verkaufteAnzahlJahr(int[][] zahlen, int welchesSmartphone) {
        int sum = 0;
        if (welchesSmartphone < 0 || welchesSmartphone >= zahlen.length) {
            return -1;
        }

        for (int j = 0; j < zahlen[welchesSmartphone].length; j++) {
            sum = sum + zahlen[welchesSmartphone][j];
        }

        return sum;
    }


//      return 0; // todo: druch korrekten Coden bitte ersetzen.

    //    die folgende Method soll uns den Namen des Smartphones liefern, das in einem bestimmten Quartal am erfolgreichsten war
//    zahlen: unser verkaufzahlen
//    namen: unser verkaufszahlen
//    quartalNr: für welches Quartal soll berechnet werden(zweischen 1 und 4) - sonst Rückgabwert leerer String
//    return ""; // todo: druch korrekten Coden ersetzen
//    public static String[] smartphoneHighestSale(int[][] zahlen, String[] phone) {
//        int[] max = new int[phone.length];
//        String[] maxPhone = new String[zahlen[0].length];
//        for (int j = 0; j < zahlen[j].length; j++) {
//            for (int i = 0; i < phone.length; i++) {
//                if (zahlen[i][j] > max[j]) {
//                    max[j] = zahlen[i][j];
//                    maxPhone[j] = phone[i];
//                }
//
//            }
//
//
//        }
//        return maxPhone;
//    }
    public static String bestSalePhone(int[][] zahlen, String[] phoneName, int quarter) {
        String bestSale = phoneName[0];
        int temp = zahlen[0][0];
        for (int j = 0; j < zahlen[j].length; j++) {
            for (int i = 0; i < zahlen.length; i++) {
                if (zahlen[i][j] > temp) {
                    temp = zahlen[i][j];
                    bestSale = phoneName[i];
                }
            }
        }
        return bestSale;


    }
}