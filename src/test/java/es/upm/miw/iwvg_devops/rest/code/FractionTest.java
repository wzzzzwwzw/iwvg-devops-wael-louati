package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction testFraction, inputFraction;

    @BeforeEach //antes de hacer cada test, añadimos esto
    void before() {
        this.testFraction = new Fraction(8, 5);
        this.inputFraction = new Fraction(4, 6);
    }

    @Test
    void testGetNumerator() {
        assertEquals(8, testFraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(5, testFraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        Fraction newFraction = this.testFraction;
        newFraction.setNumerator(9);
        assertEquals(9, newFraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        Fraction newFraction = this.testFraction;
        newFraction.setDenominator(4);
        assertEquals(4, newFraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(1.6, testFraction.decimal(), 10e5);
    }


}