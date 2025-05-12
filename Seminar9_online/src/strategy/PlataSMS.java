package strategy;

public class PlataSMS implements IMetodaPlata{
   // float credit;

    public PlataSMS() {
       // this.credit = credit;
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit prin SMS. ");
    }
}
