package clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String nume, int nrPersoane, int ora) {
        System.out.println(nume + "are o rezervare de" + nrPersoane + "Ora" + ora);
    }
}
