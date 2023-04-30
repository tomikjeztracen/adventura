package cz.vse.adventura.logika;

public class PrikazSchovejSe implements IPrikaz{

    private final HerniPlan herni_plan;

    public PrikazSchovejSe(HerniPlan herni_plan) {
        this.herni_plan = herni_plan;

    }

    @Override
    public String provedPrikaz(String... parametry) {
        if (!herni_plan.getAktualniProstor().hasVec("sloup")){
            return "V prostoru není kde se schovat, zkus jít do jiného";
        }
        //implementovat po vytvoření Hráč class
        return "teď jsi schovaný, léčíš se";
    }

    @Override
    public String getNazev() {
        return null;
    }
}
