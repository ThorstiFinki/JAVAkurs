public class Application {
    /**
     * Hauptprogramm.
     *
     * @param args Übergabe an die JVM.
     */
    public static void main(String[] args) {

        //  loops(); //Spielereien mit for-Schleife
        //  Consoleinputs(); //Einlesen verschiedener Datentypen über Konsole
        //  datentypen(); //beispiele für verschiedene Datentypen und deren Ausgabe
        //  variable();  //Variablendeklarationen
        //  literate(); //Beispiele für Literate
    }
    public static void loops() {
        boolean exit = true;
        for (int i = 1; exit; i++) {
            if (i == 1)
                System.out.printf("Hallo Anne hier kommt  %2d Knutscher! %n", i);
            else System.out.printf("Hallo Anne hier kommen %2d Knutscher! %n", i);
            if (i > 9)
                exit = false;
        }
    }
    public static void Consoleinputs() {
        System.out.println("Bitte geben sie eine Integer Zahl ein!");
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte geben sie eine Fließkommazahl ein!");
        double zahl = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Wie soll das Produkt heißen?");
        String ergebnis = new java.util.Scanner(System.in).nextLine();
        System.out.printf("Das Produkt mit Namen %s lautet: %.2f%n", ergebnis, number * zahl);

    }
    public static void datentypen() {
        System.out.printf("Im Folgenden sind verschiedene %s dargestellt. Aktuell sind es %d.", "Funktionen", 4);
        System.out.printf("%n");

        System.out.println(10.5 % 6);
        System.out.println(10 / 6);
        System.out.println(1.0 == 1);
        System.out.println(true && true);
        System.out.println(true & true);
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));
        System.out.println((int) (Math.random() * 11));

        int nn = 99;
        String hello = "Hallo ";
        System.out.println(hello + 99 + " Welten");
        System.out.println(1 + 1 + " 2 " + 66 + 77); //Alles nach String wird als string erkannt
        System.out.println(1 + 1 + " 2 " + (66 + 77)); //Unterbinden lässt sich das mit Klammern.

    }
    public static void variable() {
        //int -> 4Byte
        int age1 = 100;
        //long -> 8Byte
        long age2 = 100000000000L;
        //Konstante
        final double PI = 3.1415;
    }
    public static void literate() {

        System.out.println("Hallo Welt!");
        System.out.println(123);
        System.out.println(1.23);
        System.out.println('G');
        System.out.println('/');
        System.out.println('\'');
        System.out.println(true);
        System.out.println(0xF16B);
        System.out.println(0b1000_1010_1010_1010);
        System.out.println(6_500_300);
        System.out.println("456 %");
    }
}
