package cz.vse.adventura.logika;

public class PrikazPoloz implements IPrikaz{

    private final HerniPlan herni_plan;
    private Batoh batoh;

    public PrikazPoloz(Batoh batoh, HerniPlan herniPlan) {
        this.batoh = batoh;
        this.herni_plan = herniPlan;
    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (batoh.getItems().containsKey(parametry[0])){
            batoh.removeItem(parametry[0]);
            herni_plan.getAktualniProstor().addVec(new Vec("jablko", true,1));

            return "položil jsi: " + parametry[0];
        }


        return "tato vec se v batohu nenachází";
    }

    @Override
    public String getNazev() {
        return "poloz";
    }
}
