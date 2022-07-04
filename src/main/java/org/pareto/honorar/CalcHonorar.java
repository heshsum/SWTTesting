package org.pareto.honorar;

/**
 * Klasse für die Berechnung eines Autorenhonorars
 */
public class CalcHonorar {
    /**
     * Methode um das Honorar für einen Autor zu berechnen.
     * @param s der Text für den das Honorar berechnet werden soll.
     *          Mindestlänge für den Text: 1000 Zeichen
     * @return das Honorar des Autors
     * @throws IllegalArgumentException wenn die Mindestlänge unterschritten wird
     * oder der Text leer ist
     */
    public int getHonorar(String s) throws IllegalArgumentException {
        if (s == null || s.length() < 100) {
            throw new IllegalArgumentException();
        }
        return s.replaceAll("\\s+", "").length() / 10;
    }

    /**
     * Methode um die Anzahl der Bildelemente zurückzugeben
     * @param s der Text der auf Bilder überprüft werden soll
     * @return die Anzahl wie oft die Zeichenfolge "Bild" in dem Text vorkommt
     */
    public int countPictures(String s) {
        // Da man immer min. 1 Element in dem Array hat, wird 1 abgezogen
        return s.split("Picture").length-1;
    }
}
