package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.tekoaly.Tekoaly;
import ohtu.kivipaperisakset.tekoaly.TekoalyParannettu;
import ohtu.kivipaperisakset.logiikka.KPSPelaajaVsPelaaja;
import ohtu.kivipaperisakset.logiikka.KPSTekoaly;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pelimoottori peli = new Pelimoottori();
        peli.run();
    }
}
