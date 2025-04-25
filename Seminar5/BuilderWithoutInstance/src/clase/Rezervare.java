package clase;

public class Rezervare {
    private Boolean asezareGeam;
    private Boolean scaunErgonomic;
    private Boolean decorareMasa;
    private String genMuzica;
    private String numeClient;


    Rezervare(Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorareMasa, String genMuzica, String numeClient) {
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
        this.numeClient = numeClient;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clase.Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scaunErgonomic);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
