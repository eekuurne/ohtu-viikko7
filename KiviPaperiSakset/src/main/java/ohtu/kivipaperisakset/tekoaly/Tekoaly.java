package ohtu.kivipaperisakset.tekoaly;

import ohtu.kivipaperisakset.tekoaly.TekoalyInterface;

public class Tekoaly implements TekoalyInterface {

    int siirto;

    public Tekoaly() {
        siirto = 0;
    }

    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }

    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
