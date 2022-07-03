package org.pareto.mocking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TestMocking {
    Depot d;
    Aktie apple;
    Aktie bayer;

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
    void testGetAktie() {
        d.addAktie(apple);
        Assertions.assertEquals(apple, d.getAktie(0));
    }

    @Test
    void testGetTicker() {
        Ticker mockTicker = mock(Ticker.class);
        d.setTicker(mockTicker);
        Assertions.assertEquals(mockTicker, d.getTicker());
    }

    @Test
    void testTicker() {
        d.addAktie(apple);
        d.addAktie(bayer);

        Ticker mockTicker = mock(Ticker.class);
        when(mockTicker.getKurs(apple)).thenReturn(250.00);
        when(mockTicker.getKurs(bayer)).thenReturn(55.55);
        d.setTicker(mockTicker);

        Assertions.assertEquals(555.55, d.getDepotwert());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Apple", apple.getName());
    }

    @Test
    void getSymbol() {
        Assertions.assertEquals("AAPL", apple.getSymbol());
        apple.setSymbol("APPL");
        Assertions.assertEquals("APPL", apple.getSymbol());
    }

    @Test
    void testAnzahl() {
        Assertions.assertEquals(2, apple.getAnzahl());
        apple.setAnzahl(1);
        Assertions.assertEquals(1, apple.getAnzahl());
    }

}
