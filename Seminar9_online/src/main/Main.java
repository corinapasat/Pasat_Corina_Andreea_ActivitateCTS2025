package main;


import strategy.Calator;
import strategy.CardCalatorie;
import strategy.IMetodaPlata;
import strategy.PlataSMS;

public class Main {
    public static void main(String[] args) {
            IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(1);

            Calator corina = new Calator("Corina", metodaPlataCardCalatorie);
            corina.platesteBilet(5);
            corina.setMetodaPlata(new PlataSMS());
            corina.platesteBilet(5);
            corina.setMetodaPlata(metodaPlataCardCalatorie);
            corina.platesteBilet(5);
    }
}
