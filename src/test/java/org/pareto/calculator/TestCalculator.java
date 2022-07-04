package org.pareto.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.pareto.mocking.Ticker;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestCalculator {

    /** Calculator Object for testing. */
    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }
    @Test
    void add() {
        Assertions.assertEquals(23, c.add(11, 12));
        Assertions.assertNotEquals(23 , c.add(11, 11));
    }

    @Test
    void sub() {
        Assertions.assertEquals(0, c.sub(11, 11));
        Assertions.assertEquals(23, c.sub(11, -12));
    }

    @Test
    void div() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> c.div(42, 0));
        Assertions.assertEquals(5, c.div(35, 7));
    }

    @Test
    void mocking() {
        Calculator mockCalc = mock(Calculator.class);
        when(mockCalc.div(20, 0)).thenReturn(5);
        Assertions.assertEquals(5, mockCalc.div(20, 0));
    }

    @Test
    void spying() {
        Calculator spyCalc = Mockito.spy(new Calculator());
        Assertions.assertThrows(IllegalArgumentException.class, () -> spyCalc.div(20,0));
    }
}
