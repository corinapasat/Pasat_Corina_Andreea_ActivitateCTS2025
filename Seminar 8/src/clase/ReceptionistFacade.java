package clase;

public class ReceptionistFacade {
    public String sePoateLuaMasa(Masa masa){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa.isEsteLibera()){
            if( picolo.esteDebarasata(masa)){
                if(ospatar.esteAranjataMasa(masa)){
                    return "Se poate lua masa  la masa cu numarul "  + masa.getNrMesa();
                }
                else {
                    return ("Asteptati putin sa fie arantaja masa");
                }
            }else {
                return ("Asteptati putin tocmai s-a ridicat cineva");
            }
        }
        else{
            return ("Masa nu e disponibila");
        }
    }
}
