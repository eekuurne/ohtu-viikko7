package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.logiikka.KPS;
import ohtu.kivipaperisakset.logiikka.KPSPelaajaVsPelaaja;
import ohtu.kivipaperisakset.logiikka.KPSTekoaly;
import ohtu.kivipaperisakset.tekoaly.Tekoaly;
import ohtu.kivipaperisakset.tekoaly.TekoalyParannettu;

/**
 *
 * @author eekuurne
 */
public class KPSFactory {
    
    public static KPS pelaajaVsPelaaja(Scanner scanner) {
        return new KPSPelaajaVsPelaaja(scanner);
    }

    public static KPS pelaajaVsHelppoAI(Scanner scanner) {
        return new KPSTekoaly(scanner, new Tekoaly());
    }

    public static KPS pelaajaVsVaikeaAI(Scanner scanner) {
        return new KPSTekoaly(scanner, new TekoalyParannettu(20));
    }
}
