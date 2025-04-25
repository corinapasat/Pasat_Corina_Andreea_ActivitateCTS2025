package ro.cts.main;

import ro.cts.model.personal.personal.Asistent;
import ro.cts.model.personal.personal.Profesor;
import ro.cts.model.personal.platforma.Curs;
import ro.cts.model.personal.platforma.IPredabil;
import ro.cts.model.personal.platforma.Persoana;
import ro.cts.model.personal.platforma.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", 21,"1", 2));
        studenti.add(new Student("Popa", 21,"1", 3));

        IPredabil profesor = new Profesor("Gigel", 38 , "1" , 12);

        Curs curs = new Curs(profesor, studenti , "Gigel");
        curs.sustineExamen();
        IPredabil asistent = new Asistent("Marian", 26,2);

        curs.setCadruDidactic(asistent);
        ((Persoana)curs.getCadruDidactic()).afiseazaModInvatare();


    }
}
