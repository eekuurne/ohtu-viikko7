package ohtu.kivipaperisakset.logiikka;

import java.util.Scanner;
import ohtu.kivipaperisakset.tekoaly.TekoalyInterface;

public class KPSTekoaly extends KPS {

    private TekoalyInterface tekoaly;

    public KPSTekoaly(Scanner scanner, TekoalyInterface tekoaly) {
        super(scanner);
        this.tekoaly = tekoaly;
    }

    @Override
    public String toinenPelaajaSiirtaa(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        
        tekoaly.asetaSiirto(ekanSiirto);
        return siirto;
    }
}