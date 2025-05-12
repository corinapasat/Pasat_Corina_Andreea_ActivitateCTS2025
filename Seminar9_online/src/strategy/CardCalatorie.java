package strategy;

public class CardCalatorie implements IMetodaPlata{
    int nrCalatoriiRamase;


    public CardCalatorie(int nrCalatorii) {
        nrCalatoriiRamase = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
       if (nrCalatoriiRamase > 0){
           System.out.println("Ai platit cu cardul de calatorii");
           nrCalatoriiRamase -= 1;
       }else {
           System.out.println("Nu mai ai calatorii ramase :((");
       }
    }
}
