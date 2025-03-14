package ro.cts.pachet.seminar3.anunturi;

public class Anunt {
    private String adresa;
    private String proprietar;
    private int numarCamere;
    private int nrAnunt;

    protected Anunt(String adresa, String proprietar, int numarCamere, int nrAnunt) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.numarCamere = numarCamere;
        this.nrAnunt = nrAnunt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Anunt{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", proprietar='").append(proprietar).append('\'');
        sb.append(", numarCamere=").append(numarCamere);
        sb.append(", nrAnunt=").append(nrAnunt);
        sb.append('}');
        return sb.toString();
    }
}
