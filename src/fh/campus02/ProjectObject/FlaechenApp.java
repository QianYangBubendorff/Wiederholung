package fh.campus02.ProjectObject;

public class FlaechenApp {
    public static void main(String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        Punkt c = a;
        System.out.println(a.x + " " + a.y);
//        System.out.println(b);
        a.aenderePosition(1,2);
        System.out.println(a.x + " " + a.y);
        System.out.println(c.x + " " + c.y);
//         da a und c beides Referenzen sind und auf das gleiche Punkt Objekt zeigen.
        if (a == c){
            System.out.println("a und c zeigen auf gleichen Punkt Instanz");
        }
    }
}
