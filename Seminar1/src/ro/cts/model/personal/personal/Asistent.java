package ro.cts.model.personal.personal;

import ro.cts.model.personal.platforma.IPredabil;
import ro.cts.model.personal.platforma.Persoana;

public class Asistent extends Persoana implements IPredabil {
    private int id;
    private float ani;
    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Asistentul invata de ");
        sb.append(this.ani);
        sb.append("ani");
        System.out.println(sb);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Asistent(String nume, int varsta, int id) {
        super(nume, varsta);
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ro.cts.model.personal.personal.Asistent{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Asistentul,");
        sb.append(super.nume);
        sb.append("Preda la seminar");
        System.out.println(sb);
    }

}
