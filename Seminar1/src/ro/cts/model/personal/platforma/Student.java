package ro.cts.model.personal.platforma;

public class Student extends Persoana {
    private String idStudent;
    private int aniStud;

   public String getIdStudent(){
        return this.idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public int getAniStud() {
        return aniStud;
    }

    public void setAniStud(int aniStud) {
        this.aniStud = aniStud;
    }

    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Studentul cu numele");
        sb.append(super.nume);
        sb.append("Studiaza de:");
        sb.append(this.aniStud);
        System.out.println(sb);
    }

    public Student(String nume, int varsta, String idStudent, int aniStud) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.aniStud = aniStud;
    }


}
