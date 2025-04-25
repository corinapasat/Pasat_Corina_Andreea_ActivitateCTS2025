package fabrici;

import clase.FelMancare;

public interface TipMancareFactory {
    FelMancare preparareFelMancare(TipFelMancare tip, float pret, int nrCalorii);
}
