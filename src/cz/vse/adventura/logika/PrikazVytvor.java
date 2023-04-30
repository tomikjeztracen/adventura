package cz.vse.adventura.logika;

public class PrikazVytvor implements IPrikaz {
    private final HerniPlan herniPLan;
    private final Batoh batoh;

    public PrikazVytvor(HerniPlan herniPlan, Batoh batoh) {
        this.batoh = batoh;
        this.herniPLan = herniPlan;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if(!herniPLan.getAktualniProstor().hasVec("craftak")){
            return "Craftak je jen v Overworldu";
        }
        if ("diamanty".equals(parametry[0])){
            if(batoh.getItems().containsKey("diamanty")){
                Vec vec = batoh.getItems().get("diamanty");
                if (vec.getPocet() >= 5){

                    herniPLan.getAktualniProstor().addVec(new Vec("diamantovy mec", true, 1));
                }
            }

        }



        return "vytvor";
    }

    @Override
    public String getNazev() {
        return null;
    }
}
