package org.pareto.mocking;

import java.util.ArrayList;

/**
 * Klasse für ein Aktiendepot.
 */
public class Depot {
    /** Liste von Aktien. */
    private ArrayList<Aktie> aktien = new ArrayList<>();

    private Ticker ticker;

    public void addAktie(Aktie a) {
        aktien.add(a);
    }

    public Aktie getAktie(int index) {
        return aktien.get(index);
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Ticker getTicker() {
        return this.ticker;
    }

    public double getDepotwert(){
        double wert = 0.0;

        for(Aktie aktie:aktien){
            wert = wert + (aktie.getAnzahl() * ticker.getKurs(aktie));
        }
        return wert;
    }
}
