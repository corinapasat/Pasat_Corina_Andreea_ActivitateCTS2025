package Prototype.Problema2;

public abstract class ARezervare {

    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public abstract void descriere();
    public abstract ARezervare copiaza();

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3)
            this.numeClient = numeClient;
        else{
            this.numeClient = "Necunoscut";
        }
        if(nrPersoane > 2)
            this.nrPersoane = nrPersoane;
        else{
            this.nrPersoane = 0;
        }
        if(data.length()  == 0)
            this.data = data;
        else{
            this.data = "01.09.2020";
        }
        this.ora = ora;
    }

    public ARezervare(){
        this.numeClient = "-";
        this.nrPersoane = 0;
        this.data = "12";
        this.ora = "3";
    }
}
