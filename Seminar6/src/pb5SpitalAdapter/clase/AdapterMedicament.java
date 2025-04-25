package pb5SpitalAdapter.clase;

public class AdapterMedicament extends MedicamentFarmacie {

    private MedicamentSpital medicamentSpital;
    public AdapterMedicament(int pret, String nume, Boolean esteInStoc) {
        super(pret, nume, esteInStoc);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getPret(), medicamentSpital.getNume(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizioneazaMedicament();
    }
}
