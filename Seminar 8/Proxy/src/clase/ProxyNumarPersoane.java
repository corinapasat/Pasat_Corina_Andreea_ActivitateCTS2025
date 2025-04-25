package clase;

public class ProxyNumarPersoane implements IRezervare {
    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String nume, int nrPersoane, int ora) {
        if( nrPersoane > 4){
            this.rezervare.rezerva(nume,nrPersoane,ora);
        }
        else{
            System.out.println("Nu avem rezervare");
        }
    }
}
