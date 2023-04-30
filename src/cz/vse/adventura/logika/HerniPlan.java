package cz.vse.adventura.logika;


/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2016/2017
 */
public class HerniPlan {
    
    private Prostor aktualniProstor;
    
     /**
     *  Konstruktor který vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví halu.
     */
    public HerniPlan() {
        zalozProstoryHry();

    }
    /**
     *  Vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví domeček.
     */
    private void zalozProstoryHry() {
        // vytvářejí se jednotlivé prostory
        Prostor Overworld = new Prostor("Overworld","overworld");
        Prostor Jeskyne = new Prostor("Jeskyně", "Jeskyně");
        Prostor Nether = new Prostor("Nether","Nether");
        Prostor TheEnd = new Prostor("TheEnd","TheEnd");


        //přidat věci do Overworldu
        Vec jablko = new Vec("jablko", true, 1);
        Vec craftingTable = new Vec("craftak", false, 1);
        Overworld.addVec(jablko);
        Overworld.addVec(craftingTable);

        //přidat věci do Netheru
        Vec zlate_jablko = new Vec("zlaté jablko", true, 1);
        Nether.addVec(zlate_jablko);

        //pridat věci do Jeskyně
        //TODO implementovat generátor pro železo a diamanty
        Vec zelezo = new Vec("zelezo", true, 10);
        Vec diamanty = new Vec("diamanty", true,10 );
        Vec dulni_vozik = new Vec("dulni vozik", true, 1);
        Jeskyne.addVec(zelezo);
        Jeskyne.addVec(diamanty);
        Jeskyne.addVec(dulni_vozik);

        //pridat věci do Endu
        Vec sloup = new Vec("sloup", false, 1);
        TheEnd.addVec(sloup);


        // přiřazují se průchody mezi prostory (sousedící prostory)
        Overworld.addVychod(Jeskyne);
        Overworld.addVychod(Nether);

        Jeskyne.addVychod(TheEnd);
        Jeskyne.addVychod(Overworld);

        Nether.addVychod(Overworld);

        TheEnd.addVychod(Jeskyne);
                
        aktualniProstor = Overworld;  // hra začíná v Overworldu
    }
    
    /**
     *  Metoda vrací odkaz na aktuální prostor, ve ktetém se hráč právě nachází.
     *
     *@return     aktuální prostor
     */
    
    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }
    
    /**
     *  Metoda nastaví aktuální prostor, používá se nejčastěji při přechodu mezi prostory
     *
     *@param  prostor nový aktuální prostor
     */
    public void setAktualniProstor(Prostor prostor) {
       aktualniProstor = prostor;
    }

}
