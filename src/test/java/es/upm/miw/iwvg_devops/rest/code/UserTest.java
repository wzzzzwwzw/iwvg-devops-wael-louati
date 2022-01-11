package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private List<Fraction> testFractions = List.of(
            new Fraction(2, 1),
            new Fraction(-1, 5),
            new Fraction(2, 4),
            new Fraction(4, 3)
    );
    private User testUser;

    private List<Fraction> testFractions2 = List.of(
            new Fraction(2, 1),
            new Fraction(-1, 5),
            new Fraction(2, 4),
            new Fraction(4, 3)
    );
    private List<Fraction> suma = List.of(
            new Fraction(4, 1),
            new Fraction(-2, 5),
            new Fraction(3, 4),
            new Fraction(8, 3)
    );

    @Test
    void testGetId() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestID", testUser.getId());
    }

    @Test
    void testGetName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestName", testUser.getName());
    }

    @Test
    void testGetFamilyName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestFamilyName", testUser.getFamilyName());
    }

    @Test
    void testSetName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        testUser.setName("NewTestName");
        assertEquals("NewTestName", testUser.getName());
    }

    @Test
    void testSetFamilyName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        testUser.setName("NewTestFamilyName");
        assertEquals("NewTestFamilyName", testUser.getName());
    }

    @Test
    void testGetFractions() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals(testFractions, testUser.getFractions());
    }

    @Test
    void testSetFractions() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        testUser.setFractions(testFractions2);
        assertEquals(testFractions2, testUser.getFractions());
    }

    @Test
    void testAddFractions() {

        List<Fraction> fractionsArray = new ArrayList<>();
        fractionsArray.add(new Fraction(1, 3));
        fractionsArray.add(new Fraction(1, 4));
        testUser = new User("TestID", "TestName", "TestFamilyName", fractionsArray);
        Fraction newFraction = new Fraction(3, 1);
        testUser.addFraction(newFraction);
        assertEquals(newFraction, testUser.getFractions().get(2));
    }

    @Test
    void testFullName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestName TestFamilyName", testUser.fullName());
    }

    @Test
    void testNameInitials() {
        testUser = new User("IdToTest", "nameToTest", "familyNameToTest", testFractions);
        assertEquals("n.", testUser.initials());
    }


}
