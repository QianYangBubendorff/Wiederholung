package fh.campus02;

public class TeilerFinden {
    public static void main(String[] args) {
        teilerFinden(12);
    }
    public static void teilerFinden (int Z){
        for (int i=2; i<=Z/2; i++){
            if(Z%i==0){
                System.out.println(i);
            }
        }

    }
}
