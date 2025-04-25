package ro.cts.model.personal.personal;

import ro.cts.model.personal.platforma.IPredabil;
import ro.cts.model.personal.platforma.Persoana;

public class Profesor extends Persoana implements IPredabil {
    private String id;
    private int vechime;
    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append("Preda la curs de");
        sb.append(this.vechime);
        System.out.println(sb);
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append(",Invata de ");
        sb.append(this.vechime);
        System.out.println(sb);
    }

    public Profesor(String nume, int varsta, String id, int vechime) {
        super(nume, varsta);
        this.id = id;
        this.vechime = vechime;
    }
}
