package fh.campus02;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println(isMetropolis(false,200001,200.0));
    }


    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth){
        if (isCapital && inhabitants>=100000 || (inhabitants>= 200000 && taxPerPersonAndMonth > (720000000/(12*inhabitants)))){
            return true;
        }
            return false;

}
}