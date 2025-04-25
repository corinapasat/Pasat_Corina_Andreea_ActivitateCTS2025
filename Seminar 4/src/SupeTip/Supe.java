package SupeTip;

public abstract class Supe {

    private int grame;
    private double pretPerSuta;
    private String ingrediente;

    public Supe(int grame, double pretPerSuta, String ingrediente) {
        this.grame = grame;
        this.pretPerSuta = pretPerSuta;
        this.ingrediente = ingrediente;
    }



    public abstract void afisareSupe();

    public double CalculeazaPret(){
        return pretPerSuta*(grame/100);
    };
}
