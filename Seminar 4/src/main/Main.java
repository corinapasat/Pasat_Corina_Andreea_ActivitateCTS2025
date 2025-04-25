package main;

import Prototype.Problema2.ARezervare;
import Prototype.Problema2.Rezervare;
import SupeTip.Supe;
import SupeTip.TipuriSupe;
import fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabrica = new FabricaSupa(200, 10.0);
        Supe supa = fabrica.getSupa(TipuriSupe.LEGUME, "bors,legume", 20);
        Supe supa2 = fabrica.getSupa(TipuriSupe.VITA, "vita,apa",30);
        supa2.afisareSupe();

        ARezervare rezervare = new Rezervare("Daria", 15 ,"21.10.2020","25");
        ARezervare rezervare1 = rezervare.copiaza();
        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

    }
}
