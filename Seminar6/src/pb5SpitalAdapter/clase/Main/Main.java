package pb5SpitalAdapter.clase.Main;

import pb5SpitalAdapter.clase.AdapterMedicament;
import pb5SpitalAdapter.clase.MedicamentFarmacie;
import pb5SpitalAdapter.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100,"Parasinus", true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie(80,"Parasinus Penta", true);

        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital = new MedicamentSpital(100,"Algocalmin");
        MedicamentSpital medicamentSpital2 = new MedicamentSpital(50,"Paracetamol");

        vindeMedicament(new AdapterMedicament(medicamentSpital));
        vindeMedicament(new AdapterMedicament(medicamentSpital2));

    }
}
