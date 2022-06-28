package JavaTest;

import java.util.ArrayList;

public class Alpinista extends Planinar {
    ArrayList<Alpinista> tim;
    int godineIskustva;

    public Alpinista(int id, int brojPoena, String ime, String prezime, ArrayList<Alpinista> tim, int godineIskustva) {
        super(id, brojPoena, ime, prezime);
        this.tim = tim;
        this.godineIskustva = godineIskustva;
    }

    public double clanarina() {
        return 1000 - 0.04 * 1000 * getBrojPoena();
    }
        //Problem -metoda radi iskljucivo kada u main metodi eksplicitno dodamo clanove u tim. Ako ih od pocetka
    //deklarisemo kao clanove tima program to ignorise
    //Takodje mucim se da povecam broj poena kod clana tima za kog se proverava da li se popeo, a ne kod clana njegovog
    // tima gde su godine iskustva vece od 5
    public boolean uspesanUspon(Planina p) {
     /*   for (int i = 0; i < tim.size(); i++) {
            if (tim.get(i).godineIskustva >= 5)
                super.setBrojPoena(getBrojPoena() + 1);
                return true;
        }
            return false;
    }*/

        for(Alpinista a : tim) {

            if (a.godineIskustva >= 5) {
                super.setBrojPoena(super.getBrojPoena() + 1);  //probao sam i sa super. i sa this. ali shvatam da je potrebna drugacija logika
                return true;
            }
            }
            return false;
        }
}
