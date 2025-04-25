package fabrici;

import SupeTip.*;

public class FabricaSupa {
    private int gramaj;
    private Double pretPerSuta;

    public FabricaSupa(int gramaj, Double pretPerSuta) {
        this.gramaj = gramaj;
        this.pretPerSuta = pretPerSuta;
    }

    public Supe getSupa(TipuriSupe supe, String ingrediente, int extra){
        switch (supe){
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj,pretPerSuta, ingrediente,extra);
                return supaLegume;
            case VITA:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSuta, ingrediente, extra);
                return supaVita;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPerSuta, ingrediente,extra);
                return supaCiuperci;
            default:
                return null;

        }

    }
}
