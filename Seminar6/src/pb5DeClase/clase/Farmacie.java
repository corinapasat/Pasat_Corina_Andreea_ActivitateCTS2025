package pb5DeClase.clase;

public class Farmacie {

    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println(this.nume+" va ofera medicamentul");
        medicamentFarmacie.cumparaMedicament();
    }
}
