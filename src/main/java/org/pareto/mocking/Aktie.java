package org.pareto.mocking;

/**
 * Eine Klasse um Wertpapiere abzubilden.
 */
public class Aktie {
    /** Das Symbol (Kürzel) der Aktie. */
    private String symbol;

    /** Der Name der Aktie. */
    private final String NAME;

    /** Die Anzahl der Aktie. */
    private int anzahl;

    /**
     * Constructor für Aktien.
     * @param symbol Das Symbol der Aktie
     * @param name Der Name der Aktie
     * @param anzahl Die Anzahl der Aktie
     */
    public Aktie(String symbol, String name, int anzahl){
        this.symbol = symbol;
        this.NAME = name.toUpperCase();
        this.anzahl = anzahl;
    }

    /**
     * Methode um das Symbol einer Aktie zu erhalten.
     * @return Das Symbol der Aktie als String
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Methode um das Symbol einer Aktie zu setzen.
     * @param symbol Das Symbol der Aktie
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Methode um die Anzahl einer Aktie zu erhalten
     * @return Die Anzahl der Aktie als Integer
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     * Methode um die Anzahl einer Aktie zu setzen.
     * @param a Die Anzahl der Aktie als Integer
     */
    public void setAnzahl(int a) {
        this.anzahl = a;
    }

    /**
     * Methode um den Namen einer Aktie zu erhalten.
     * @return Der Name der Aktie als String
     */
    public String getName() {
        return NAME;
    }
}
