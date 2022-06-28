package JavaTest;

import java.util.ArrayList;

public class Planina {
    String ime;
    String nazivDrzave;
    double visina;

    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }

    public double getVisina() {
        return visina;
    }
    //Ubacio sam geter za ime da bih proverio da li getNajvisaPlanina funkcionise ispravno
    public String getIme() {
        return ime;
    }

    public Planina getNajvisaPlanina(ArrayList<Planina> planine) {
        double max = 0;
        int indexNajvisePlanine = 0;
        for (int i = 0; i < planine.size(); i++) {
            if (planine.get(i).getVisina() > max) {
                max = planine.get(i).getVisina();
                indexNajvisePlanine = i;
            }
        }
            return planine.get(indexNajvisePlanine);

    }
}
