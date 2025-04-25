package pb5SpitalAdapter.clase;

public class MedicamentFarmacie {
    private int pret;
    private String nume;
    private Boolean esteInStoc;

    public MedicamentFarmacie(int pret, String nume,Boolean esteInStoc) {
        this.pret = pret;
        this.nume = nume;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(this.esteInStoc){
            System.out.println("Medicamentul" + this.nume + "a fost achizitionat la pretul " + this.pret + "lei");
        }else {
            System.out.println("Medicamentul " + this.nume + "nu este in stoc");
        }
    }
}
