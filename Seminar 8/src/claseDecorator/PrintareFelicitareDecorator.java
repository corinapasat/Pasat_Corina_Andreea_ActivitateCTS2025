package claseDecorator;

public abstract class PrintareFelicitareDecorator implements Nota{
    private Nota nota;

    public PrintareFelicitareDecorator(Nota nota) {
        this.nota = nota;
    }

    public void printare(){
        nota.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
