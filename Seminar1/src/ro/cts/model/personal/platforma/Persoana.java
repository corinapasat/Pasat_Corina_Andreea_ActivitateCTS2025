package ro.cts.model.personal.platforma;

import ro.cts.model.personal.platforma.IPersoana;

public abstract class Persoana implements IPersoana {
    protected String nume;
    protected int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume(){
        return nume;
    }
    @Override
    public int getVarsta() {
        return varsta;
    }

    public abstract void afiseazaModInvatare();

}
