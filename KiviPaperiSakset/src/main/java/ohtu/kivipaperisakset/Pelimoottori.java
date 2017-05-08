package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.logiikka.KPS;

/**
 *
 * @author eekuurne
 */
public class Pelimoottori {
    
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        
        while (true) {
            tulostaAlku();
            KPS matsi = valitseKPS(scanner.nextLine());
            if (matsi == null) {
                break;
            }
            matsi.pelaa();
        }
    }

    private void tulostaAlku() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
    
    private KPS valitseKPS(String vastaus) {
        switch (vastaus) {
            case ("a"):
                return KPSFactory.pelaajaVsPelaaja(scanner);
            case ("b"):
                return KPSFactory.pelaajaVsHelppoAI(scanner);
            case ("c"):
                return KPSFactory.pelaajaVsVaikeaAI(scanner);
        }
        return null;
    }
}
