package main;

import clase.Masa;
import clase.ReceptionistFacade;
import claseDecorator.Nota;
import claseDecorator.NotaDePlataRevelion;
import claseDecorator.NotadePlata;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(true, 20, 4);
        Masa masa2 = new Masa(true, 23, 4);
        ReceptionistFacade receptionist = new ReceptionistFacade();
        System.out.println(receptionist.sePoateLuaMasa(masa));
        System.out.println(receptionist.sePoateLuaMasa(masa2));


        Nota notaDePlata = new NotadePlata(500);
        notaDePlata.printare();
        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();


    }
}
