package ohtu.kivipaperisakset.logiikka;

import java.util.Scanner;
import ohtu.kivipaperisakset.Tuomari;

/**
 *
 * @author eekuurne
 */
public abstract class KPS {
    
    protected Scanner scanner;
    protected Tuomari tuomari;

    public KPS(Scanner scanner) {
        this.tuomari = new Tuomari();
        this.scanner = scanner;
    }

    public void pelaa() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        
        String ekanSiirto = ensimmainenPelaajaSiirtaa();
        String tokanSiirto = toinenPelaajaSiirtaa(ekanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = ensimmainenPelaajaSiirtaa();
            tokanSiirto = toinenPelaajaSiirtaa(ekanSiirto);
        }
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    
    public String ensimmainenPelaajaSiirtaa(){
        System.out.println("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }
    
    protected abstract String toinenPelaajaSiirtaa(String ekanSiirto);

    protected boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
