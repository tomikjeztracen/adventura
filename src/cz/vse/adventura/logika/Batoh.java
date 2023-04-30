package cz.vse.adventura.logika;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Batoh {
    HashMap<String, Vec> obsah_batohu = new HashMap<String, Vec>();

    public Batoh() {
    }

    public void addItem(String nazev_veci, Vec item) {
        obsah_batohu.put(nazev_veci, item);
    }

    public void removeItem(String nazev_veci) {
        obsah_batohu.remove(nazev_veci);
    }

    public HashMap<String, Vec> getItems() {
        return obsah_batohu;
    }
}
