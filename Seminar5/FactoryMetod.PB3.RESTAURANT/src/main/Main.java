package main;

import clase.FelMancare;
import fabrici.Supa;
import fabrici.SupaFactory;
import fabrici.TipMancareFactory;

public class Main {
    public static void main(String[] args) {
        TipMancareFactory fabricaDeSupe = new SupaFactory(450);
        FelMancare supa1 = fabricaDeSupe.preparareFelMancare(Supa.SupaCiuperci, 30 , 300);
        FelMancare supa2 = fabricaDeSupe.preparareFelMancare(Supa.SupaLegume, 25, 250);

    }
}
