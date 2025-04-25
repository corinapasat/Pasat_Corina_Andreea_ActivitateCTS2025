package SupeTip;

public class SupaVita extends Supe {
    private int gramajVita;

    public SupaVita(int grame, double pretPerSuta, String ingrediente, int gramajVita) {
        super(grame, pretPerSuta, ingrediente);
        this.gramajVita = gramajVita;
    }

    public  double CalculeazaPret(){
        return CalculeazaPret()*gramajVita;
    }

    @Override
    public void afisareSupe() {
        System.out.println("Ati comandat supa de Vita");
    }
}
