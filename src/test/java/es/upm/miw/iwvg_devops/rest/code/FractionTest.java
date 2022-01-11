package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void testAdd() {
        Fraction addedFraction = new Fraction(68, 30);
        assertTrue(addedFraction.isEquivalent(testFraction.add(inputFraction)));
    }
    @Test
    void testSub() {
        Fraction SubbedFraction = new Fraction(14, 15);
        assertTrue(SubbedFraction.isEquivalent(testFraction.sub(inputFraction)));
    }

    @Test
    void testIsProper() {
        assertFalse(testFraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertTrue(testFraction.isImproper());
    }

    @Test
    void testDivide() {
        Fraction dividedFraction = new Fraction(48, 20);
        assertTrue(dividedFraction.isEquivalent(testFraction.divide(inputFraction)));
    }
    @Test
    void testMul() {
        Fraction dividedFraction = new Fraction(32, 30);
        assertTrue(dividedFraction.isEquivalent(testFraction.mul(inputFraction)));
    }

}