package clase;

public interface IBuilder {

    Rezervare buildRezervare();

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScaunErgonomic(Boolean scaunErgonomic);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);
    IBuilder setNume(String nume);

}