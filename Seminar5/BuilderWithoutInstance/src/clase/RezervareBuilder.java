package clase;

public class RezervareBuilder implements IBuilder {

    private Boolean asezareGeam;
    private Boolean scaunErgonomic;
    private Boolean decorareMasa;
    private String genMuzica;
    private String numeClient;


    @Override
    public Rezervare buildRezervare(String numeClient) {
        return new Rezervare(asezareGeam,scaunErgonomic,decorareMasa,genMuzica,numeClient);
    }

    public IBuilder setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return  this;
    }

    @Override
    public IBuilder setScaunErgonomic(Boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return null;
    }

    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public IBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }


}
