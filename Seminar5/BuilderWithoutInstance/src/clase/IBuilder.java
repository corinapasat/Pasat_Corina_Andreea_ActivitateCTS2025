package clase;

public interface IBuilder {
    Rezervare buildRezervare(String numeClient);

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScaunErgonomic(Boolean scaunErgonomic);
    IBuilder setDecorareMasa(Boolean decorareMasa);
    IBuilder setGenMuzica(String genMuzica);



}
