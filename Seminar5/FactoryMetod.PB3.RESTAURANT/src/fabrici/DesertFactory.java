package fabrici;

import clase.Clatite;
import clase.FelMancare;
import clase.Papanasi;

public class DesertFactory implements TipMancareFactory{

    private String crema;

    public DesertFactory(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelMancare preparareFelMancare(TipFelMancare tip, float pret, int nrCalorii) {
        if(tip instanceof Desert desertTip){
        return switch (desertTip) {
            case Papanasi -> new Papanasi(pret, nrCalorii, crema);
            case Clatite -> new Clatite(pret, nrCalorii, crema);
            };
        }
        return null;
    }
}
