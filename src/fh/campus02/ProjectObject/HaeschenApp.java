package fh.campus02.ProjectObject;

public class HaeschenApp {
    public static void main(String[] args) {
        System.out.println(Haeschen.spezies);
        Haeschen rogger = new Haeschen();
//        zugriff auf Atribut mittels Objekt- bzw. Instanznamen
        rogger.name = "Rogger Rabbit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " +rogger.farbe);
        Haeschen bugs = null; //nur um zu zeigen, dass auch erst spaeter die instaz erzeugt werden kann
//        irgendwann spaeter
        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";
//        was geht noch aber ist unueblich
//        wir testen unser hoppel methode - ohne haeschen geht nix
//        Haeschen...geht nicht.
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");

//        Aufruf statische Methode
        Haeschen.ausgabeSpezies();

    }
}
