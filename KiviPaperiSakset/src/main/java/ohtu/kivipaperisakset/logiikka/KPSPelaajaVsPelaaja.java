package ohtu.kivipaperisakset.logiikka;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    public KPSPelaajaVsPelaaja(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String toinenPelaajaSiirtaa(String ekanSiirto) {
        System.out.println("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }
}