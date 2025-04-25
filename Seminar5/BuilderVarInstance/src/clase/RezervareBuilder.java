package clase;

public class RezervareBuilder implements IBuilder {

    Rezervare rezervare;


   public RezervareBuilder(String numeClient) {

        this.rezervare = new Rezervare(false,false,false,"-", numeClient);

    }

    @Override
    public Rezervare buildRezervare() {
        return this.rezervare;
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
       this.rezervare.setAsezareGeam(asezareGeam);
        return this;
    }

    @Override
    public IBuilder setScaunErgonomic(Boolean scaunErgonomic) {
        this.rezervare.setScauneErgonomice(scaunErgonomic);
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        this.rezervare.setDecorareMasa(decorareMasa);
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
       this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public IBuilder setNume(String nume) {
        this.rezervare.setNumeClient(nume);
        return this;
    }
}
