package claseDecorator;

public class NotadePlata implements Nota {
    private float totalDePlata;

    public NotadePlata(float totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    public void printare(){
        System.out.println("Aveti de plata suma de " + totalDePlata + "RON");
    }
}
