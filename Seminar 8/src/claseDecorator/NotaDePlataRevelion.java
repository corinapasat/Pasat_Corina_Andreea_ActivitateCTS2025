package claseDecorator;

public class NotaDePlataRevelion extends PrintareFelicitareDecorator{

    public NotaDePlataRevelion(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
