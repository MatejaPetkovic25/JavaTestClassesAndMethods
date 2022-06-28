package JavaTest;

public class RekreativniPlaninar extends Planinar{
    double tezinaOpreme;
    String nazivOkruga;
    double maxUspon;

    public RekreativniPlaninar(int id, int brojPoena, String ime, String prezime, double tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, brojPoena, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }
    public double clanarina() {
        return 1000 - 0.01 * 1000 * getBrojPoena();
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if (maxUspon >= p.getVisina() + tezinaOpreme * 50) {
            setBrojPoena(getBrojPoena() + 1);
            return true;
        }
        else return false;
    }
}
