package SupeTip;

public class SupaLegume extends Supe {


    private double gramajCrutoane;

    public SupaLegume(int grame, double pretPerSuta, String ingrediente, int gramajCrutoane) {
        super(grame, pretPerSuta, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }


    public double CalculeazaPret(){
        return CalculeazaPret()*(gramajCrutoane*2);
    }

    @Override
    public void afisareSupe() {
        System.out.println("Ati Comandat supa de ciuperci");
    }
}
