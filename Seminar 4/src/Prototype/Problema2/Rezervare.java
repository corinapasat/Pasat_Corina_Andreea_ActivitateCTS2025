package Prototype.Problema2;

public class Rezervare extends ARezervare {


    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare");
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare(this.numeClient, this.nrPersoane, this.data, this.ora);
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.data = this.data;
        rezervareNoua.ora = this.ora;
        return rezervareNoua;
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
