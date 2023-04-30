package cz.vse.adventura.logika;

public class PrikazSeber implements IPrikaz {
    private Batoh batoh;
    private HerniPlan herniPlan;


    public PrikazSeber(Batoh batoh, HerniPlan herniPlan){
        this.batoh = batoh;
        this.herniPlan = herniPlan;

    }

    @Override
    public String provedPrikaz(String... parametry) {
        Prostor aktualniProstor = herniPlan.getAktualniProstor();
        if (aktualniProstor.hasVec(parametry[0])) {
            Vec vec_na_pridani = aktualniProstor.getVec(parametry[0]);
            if (vec_na_pridani.isPrenositelna() == false){
                return parametry[0] + " je nepřenositelná věc";
            }
            this.batoh.addItem(parametry[0], vec_na_pridani);
            aktualniProstor.removeVec(parametry[0]);
            return "sebrano" + " " + parametry[0] + " pocet:" + vec_na_pridani.getPocet();
        }
        else {
            return parametry[0] + " v prostoru není";
        }




    }

    @Override
    public String getNazev() {
        return "seber";
    }
}
