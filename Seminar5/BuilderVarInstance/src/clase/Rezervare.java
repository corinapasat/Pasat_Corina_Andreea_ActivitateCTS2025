package clase;

public class Rezervare {
    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;
    private String numeClient;


     Rezervare(Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorareMasa, String genMuzica, String numeClient) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
        this.numeClient = numeClient;
    }


    public void setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clase.Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
