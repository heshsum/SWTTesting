package org.pareto.mocking;

import java.util.ArrayList;

/**
 * Klasse für ein Aktiendepot.
 */
public class Depot {
    /** Liste von Aktien. */
    private ArrayList<Aktie> aktien = new ArrayList<>();

    /** Der Aktienticker für das Depot. */
    private Ticker ticker;

    /**
     * Methode um eine Aktie zu einem Depot hinzuzufügen.
     * @param a die Aktie, die hinzugefügt werden soll
     */
    public void addAktie(Aktie a) {
        aktien.add(a);
    }

    /**
     * Methode um eine Aktie aus dem Depot zurückzugeben
     * @param index die Indexposition der Aktie
     * @return das Aktie-Objekt
     */
    public Aktie getAktie(int index) {
        return aktien.get(index);
    }

    /**
     * Methode um den Ticker eines Depots zu setzen.
     * @param ticker Das Ticker-Objekt
     */
    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    /**
     * Methode um den Ticker eines Depots zu erhalten.
     * @return Das Ticker-Objekt für das Depot
     */
    public Ticker getTicker() {
        return this.ticker;
    }

    /**
     * Methode um den aktuellen Gesamtwert eines Depots zu erhalten.
     * @return Der Gesamtwert des Depots als Double
     */
    public double getDepotwert(){
        double wert = 0.0;

        for(Aktie aktie:aktien){
            wert = wert + (aktie.getAnzahl() * ticker.getKurs(aktie));
        }
        return wert;
    }
}
