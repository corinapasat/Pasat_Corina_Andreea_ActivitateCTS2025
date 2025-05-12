package clase;

public class Masa {
    private boolean esteLibera;
    private int nrMesa;
    private int numarPersoane;

    public Masa(boolean esteLibera, int nrMesa, int numarPersoane) {
        this.esteLibera = esteLibera;
        this.nrMesa = nrMesa;
        this.numarPersoane = numarPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMesa() {
        return nrMesa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }
}
