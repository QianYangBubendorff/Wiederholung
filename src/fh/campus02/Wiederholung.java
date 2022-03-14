package fh.campus02;

public class Wiederholung {
    public static void main(String[] args) {
        String s= "Hansi";
//        look for the first letter "a" in the string.
        int position=s.indexOf('a');
        System.out.println(position);

//       difference between i++ and ++i.
        int a=1;
        int c;
        ++a;
        System.out.println(a);
        c=++a;
        System.out.println("a: "+ a +" c: "+ c);
        c=a++;
        System.out.println("a: "+ a +" c: "+ c);
        myLittlehelper("Santa Clause");
        myLittlehelper(s);
        String helper= "Batman";
        myLittlehelper(helper);
    }
    public static void myLittlehelper (String helper){
        System.out.println("helper: "+helper);
    }
}
