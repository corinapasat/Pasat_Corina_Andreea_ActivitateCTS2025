package ro.cts.model.personal.platforma;

import java.util.List;

public class Curs{

    private IPredabil cadruDidactic;
    private List<Student> studenti;
    private String nume;

    public Curs(IPredabil cadruDidactic, List<Student> studenti, String nume) {
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
        this.nume = nume;
    }

    public String getNumeCurs(){
        return this.nume;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public void sustineExamen(){
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(((IPersoana)this.cadruDidactic).getNume()).append("Are examen la ");
        sb.append(this.nume).append("Cu urmatorii studenti");
        System.out.println(sb);
        for(Student student: studenti)
            System.out.println(student.getNume());

    }

}
