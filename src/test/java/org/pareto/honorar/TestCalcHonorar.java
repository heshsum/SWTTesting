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
    void testHonorar() {
        String s = null;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    int honorar = ch.getHonorar(s);
                });
    }

    @Test
    void zuKurzerText() {
        String s = "Hallo Welt";
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> ch.getHonorar(s));
    }

    @Test
    void honorarBerechnung() {
        StringBuilder s = new StringBuilder();
        String li = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean m";
        s.append(li.repeat(10));
        Assertions.assertEquals(8, ch.getHonorar(s.toString()));
    }
}
