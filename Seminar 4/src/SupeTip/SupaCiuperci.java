package SupeTip;

public class SupaCiuperci extends Supe {

    private int cantitate;

    public SupaCiuperci(int grame, double pretPerSuta, String ingrediente, int cantitate) {
        super(grame, pretPerSuta, ingrediente);
        this.cantitate = cantitate;
    }



    @Override
    public void afisareSupe() {
        System.out.println("Ati comandat supa de Ciuperci");
    }

    public double CalculeazaPret(){
        return super.CalculeazaPret()*(cantitate/100);
    }
}
