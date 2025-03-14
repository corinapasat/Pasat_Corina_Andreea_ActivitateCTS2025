package ro.cts.pachet.seminar3.main;

import ro.cts.pachet.seminar3.AgentieImobiliaraEager;
import ro.cts.pachet.seminar3.AgentieImobiliaraLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //  AgentieImobiliaraEager agentieImobiliara = AgentieImobiliaraEager.getAgentieImobiliara();

      //  System.out.println(agentieImobiliara.toString());
        //singleton aratam ca este o singura instanta
       // AgentieImobiliaraEager agentie2 = AgentieImobiliaraEager.getAgentieImobiliara();
      //  agentie2.setSite("Sit nou.com");
      //  agentie2.posteazaAnunt("anunt agentie 2");
       // agentieImobiliara.posteazaAnunt("anunt agentie 1");
      //  System.out.println(agentieImobiliara.toString());

        AgentieImobiliaraLazy agentie4 = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Max", 10, "Londra", 300000);
        AgentieImobiliaraLazy agentie5 = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Donna", 23, "Bucuresti", 400000);
        System.out.println(agentie5.toString());




    }
}