package JavaTest;

import java.util.ArrayList;
import java.util.Arrays;

public class PlaninarskiDom /*implements Comparable*/ {
    String nazivDoma;
    int godinaOsnivanja;
    ArrayList<Planinar> clanoviDoma;

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> clanoviDoma) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanoviDoma = clanoviDoma;
    }
    public void uclaniPlaninara(Planinar p) {
        clanoviDoma.add(p);
    }
    public int uspesnoPopeli(){
        int brojac = 0;
        for(Planinar p : clanoviDoma) {
            if (p.getBrojPoena() > 0) {
                brojac++;
            }
        }
        return brojac;
    }
   public void izbaciPlaninara(int idPlaninara) {
        for (int i = 0; i < clanoviDoma.size(); i++) {
           if (clanoviDoma.get(i).getId() == idPlaninara) {
               clanoviDoma.remove(i);
           }
       }
   }
   public double mesecniPrihod() {
       double ukupniPrihod = 0;
       for (Planinar p : clanoviDoma) {
           ukupniPrihod = ukupniPrihod + p.clanarina();
       }
       return ukupniPrihod;
   }
  /*  Pretpostavljam da se poslednji zadatak radi preko interfejsa Comparable,
  ali nisam vezbao od sinoc pa ne znam kako se pise u praksi

  public ArrayList<Planinar> sortPlaninari() {
        Arrays.sort(ArrayList clanoviDoma);
    }

   */
}
