package fh.campus02.ProjectObject;

public class Haeschen {
    String name;
    String farbe;
    static String spezies = "Leporidae";

    public void hoppel(String wohin){
        System.out.println(name + " hoppelt " + wohin);

    }
//    in static method we can only get the static attribute. Java does not know which instances we would like it to return for non-static attributes
    public static void ausgabeSpezies(){
        System.out.println(spezies);
    }

    public static class Tamagochi {
        public int x;
        public int y;
       public int futterstand;

        public void bewegen(String richtung, int schritte) {
            while (futterstand > 0 && schritte>0) {
                    if (richtung.equals("Links")) {
                        x--;
                    } else if (richtung.equals("Rechts")) {
                        x++;
                    } else if (richtung.equals("Oben")) {
                        y++;
                    } else if (richtung.equals("Unten")) {
                        y--;
                    }
                schritte--;
                futterstand--;
                }
            }

        public void futten(int f){
            futterstand = f + futterstand;
        }

        public static void main(String[] args) {
            Tamagochi neon= new Tamagochi();
         neon.x = 6;
         neon.y = 4;
         neon.futterstand = 5;
         neon.bewegen("Links", 6);
         neon.futten(5);
         neon.bewegen("Links", 1);
         neon.bewegen("Unten", 4);
         System.out.println(neon.x +" "+ neon.y);

        }
    }
}
