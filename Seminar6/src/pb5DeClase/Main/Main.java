package pb5DeClase.Main;

import pb5DeClase.clase.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("catena");
        IMedicamentFarmacie medicamentFarmacie= new MedicamentFarmacie(100,"Paduden",false);
        farmacie.vindeMedicament(medicamentFarmacie);


        AdapterClaseMedicament adapterClaseMedicament = new AdapterClaseMedicament(19,"Ceva");
        farmacie.vindeMedicament(adapterClaseMedicament);
    }
}
