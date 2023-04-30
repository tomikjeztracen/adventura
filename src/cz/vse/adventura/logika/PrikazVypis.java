package cz.vse.adventura.logika;
import java.util.HashMap;
public class PrikazVypis implements IPrikaz {


    private Batoh batoh;
    private HerniPlan herni_plan;

    public PrikazVypis (Batoh batoh, HerniPlan herni_plan){
        this.batoh = batoh;
        this.herni_plan = herni_plan;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (parametry == null){
            return "Nevalidní příkaz - zadejte vypis batoh / prostor";
        }

        if (parametry[0].equals("batoh")){
            HashMap<String, Vec> itemsMap = this.batoh.getItems();
            if (itemsMap.isEmpty()){
                return "batoh je prázndý";
            }
            String help = "";

            for (String item : itemsMap.keySet()) {
                help += item+ " ";
            }
            return help;

        }
        else if (parametry[0].equals("prostor")){
            return herni_plan.getAktualniProstor().getVypisData();

        }
        return "Nevalidní příkaz - zadejte vypis batoh / prostor";

    }

    @Override
    public String getNazev() {
        return "vypis";
    }
}
