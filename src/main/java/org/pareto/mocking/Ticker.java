package org.pareto.mocking;

/**
 * Interface für einen Börsenticker.
 */
public interface Ticker {

    /**
     * Methode um den aktuellen Kurs einer Aktie zu erhalten.
     * @param aktie Das Aktie-Objekt, für das der Kurs gesucht wird
     * @return Der Kurs des Aktie-Objektes als Double
     */
    public double getKurs(Aktie aktie);
}

