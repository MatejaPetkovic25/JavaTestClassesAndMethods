package JavaTest;

import java.util.ArrayList;

public class Testiranje {
    public static void main(String[] args) {
        ArrayList<Alpinista> prviTim = new ArrayList<>();
        ArrayList<Alpinista> drugiTim = new ArrayList<>();

        ArrayList<Planinar> dom = new ArrayList<>();

        ArrayList<Planina> planine = new ArrayList<>();

        Planina najveca = new Planina("Himalaji", "Kina", 8000);
        Planina manja = new Planina("Kopaonik", "Srbija", 1800);
        Planina srednja = new Planina("Alpi", "Svajcarska", 3500);
        planine.add(najveca);
        planine.add(manja);
        planine.add(srednja);
       //System.out.println(manja.getNajvisaPlanina(planine).getIme());

        RekreativniPlaninar rp1 = new RekreativniPlaninar(14, 0, "Pera", "Peric", 10, "Neki okrug", 1500);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(7, 0, "Zika", "Zivkovic", 8, "Neki okrug", 2500);
        RekreativniPlaninar rp3 = new RekreativniPlaninar(11, 4, "Roki", "Balboa", 12, "Filadelfija", 4700);

        Alpinista a1 = new Alpinista(9, 11, "Borivoje", "Borkovic", prviTim, 4);
        Alpinista a2 = new Alpinista(3, 7, "Djoka", "Djordjevic", prviTim, 2);
        Alpinista a3 = new Alpinista(99, 20, "Bogdan", "Bogdanovic", drugiTim, 9);
        Alpinista a4 = new Alpinista(15, 4, "Marko", "Markovic", drugiTim, 1);

        PlaninarskiDom pd = new PlaninarskiDom("Dobri dom", 2002, dom);
        pd.uclaniPlaninara(rp1);
        pd.uclaniPlaninara(a4);
        pd.izbaciPlaninara(15);
        pd.uclaniPlaninara(rp3);
        System.out.println(a1);
        a1.uspesanUspon(najveca);
        System.out.println(a1);
        prviTim.add(a4);
        prviTim.add(a3);

        System.out.println(pd.mesecniPrihod());
        System.out.println(pd.uspesnoPopeli());

        System.out.println(a1.uspesanUspon(najveca));



    }
}
