package JavaTest;

public abstract class Planinar {
    int id;
    int brojPoena;
    String ime;
    String prezime;

    public Planinar(int id, int brojPoena, String ime, String prezime) {
        this.id = id;
        this.brojPoena = brojPoena;
        this.ime = ime;
        this.prezime = prezime;
    }
    public abstract double clanarina();
    public abstract boolean uspesanUspon(Planina p);

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public int getId() {
        return id;
    }

//Razvio sam ovaj genericki toString jer u zadatku nije bilo naznaceno drukcije
    @Override
    public String toString() {
        return "Planinar{" +
                "id=" + id +
                ", brojPoena=" + brojPoena +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
