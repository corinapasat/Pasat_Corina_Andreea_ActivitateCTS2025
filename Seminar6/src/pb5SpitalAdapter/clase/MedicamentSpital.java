package pb5SpitalAdapter.clase;

public class MedicamentSpital {
    private int pret;
    private String nume;

    public void achizioneazaMedicament(){
        prezintaReteta();
        System.out.println(new StringBuilder("Si a fost achizitionat la pretul de").append(this.pret));
    }

    public MedicamentSpital(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public void prezintaReteta(){
        System.out.println(new StringBuilder("Este prezenta reteta pentru medicamentul").append(nume));
    }

    public int getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }
}
