package pb5DeClase.clase;

public class AdapterClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie {


    public AdapterClaseMedicament(int pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicament() {
        super.achizioneazaMedicament();
    }


}
