package org.pareto.mocking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TestMocking {

    Aktie a;
    Depot d;
    Aktie apple;
    Aktie bayer;
    Ticker ticker;

    @BeforeEach
    void setup() {
        d = new Depot();
        apple = new Aktie("AAPL", "Apple", 2);
        bayer = new Aktie("BAYN", "Bayer", 1);
    }

    @Test
    void testAdd() {
        d.addAktie(apple);
        Assertions.assertEquals(apple, d.getAktie(0));
    }

    @Test
    void testTicker() {
        Aktie a = new Aktie("EINS", "Eins AG", 1);
        d.addAktie(apple);
        d.addAktie(bayer);

        Ticker mockTicker = mock(Ticker.class);
        when(mockTicker.getKurs(apple)).thenReturn(250.00);
        when(mockTicker.getKurs(bayer)).thenReturn(55.55);
        d.setTicker(mockTicker);

        Assertions.assertEquals(555.55, d.getDepotwert());
    }

}
