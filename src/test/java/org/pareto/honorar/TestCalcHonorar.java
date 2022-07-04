package org.pareto.honorar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Klasse um CalcHonorar zu testen.
 */
class TestCalcHonorar {
    CalcHonorar ch;

    /** Honorar Objekt für Tests. */
    @BeforeEach
    void setUp() {
        ch = new CalcHonorar();
    }

    @Test
    void textLeer() {
        String s = null;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> ch.getHonorar(s));
    }

    @Test
    void zuKurzerText() {
        String text = "Hallo Welt".repeat(9);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> ch.getHonorar(text));
    }

    @Test
    void honorarBerechnung() {
        String text = "Lorem ipsum".repeat(10);
        Assertions.assertEquals(10, ch.getHonorar(text));
    }

    @Test
    void bildHonorarBerechnung() {
        String s1 = "Ein Mann Picture sitzt in seinem Garten Picture.";
        Assertions.assertEquals(2, ch.countPictures(s1));
        String s2 = "Ein Mann sitzt in seinem Garten.";
        Assertions.assertEquals(0, ch.countPictures(s2));
    }
}
