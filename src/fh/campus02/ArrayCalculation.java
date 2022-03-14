package fh.campus02;

public class ArrayCalculation {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5};
        int[] arr2 = {5, 6, 7};
        int add = 0;
        int mult = 0;
        for (int i = 0; i < arr1.length; i++) {
            add = arr1[i] + arr2[i];
            System.out.print(add + ", ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            mult = arr1[i] * arr2[i];
            System.out.print(mult + ", ");

        }
    }
}
