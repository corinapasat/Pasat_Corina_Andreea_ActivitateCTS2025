package fabrici;

import clase.FelMancare;
import clase.SupaCiuperci;
import clase.SupaLegume;

public class SupaFactory implements TipMancareFactory {
       private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public FelMancare preparareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        if (tip instanceof Supa supaTip) {
            return switch (supaTip) {
                case SupaCiuperci -> new SupaCiuperci(pret, nrCalorii, this.cantitate);
                case SupaLegume -> new SupaLegume(pret, nrCalorii, this.cantitate);
            };
        }
        return null;
    }
}
