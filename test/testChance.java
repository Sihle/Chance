import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class testChance {
    @Test
    public void testTheEqualityTwoChancesThatAreNotTheSame() throws Exception {
        assertFalse(new Chance(25, 56).equals(new Chance(2, 10)));
    }

    @Test
    public void testTheEqualityTwoChancesThatAreTheSame() throws Exception {
        assertTrue(new Chance(1, 6).equals(new Chance(1, 6)));
    }

    @Test
    public void testChanceEqualsAnotherChanceWhenParametersIsNotTheSame() throws Exception {
        assertTrue(new Chance(4,7).equals(new Chance(8,14)));
    }

    @Test
    public void testShouldKnowTheChanceOfAChanceAndAAnotherChance() throws Exception {
        assertEquals(new Chance(1, 16), new Chance(1, 4).and(new Chance(1, 4)));
    }
    @Test
    public void testShouldKnowAChanceAndCertaintyIsThatChance() throws Exception {
        assertEquals(new Chance(3, 5), new Chance(3, 5).and(new Chance(1, 1)));
    }
    @Test
    public void testShouldKnowThatAChanceAndImpossibilityIsImpossibility() throws Exception {
        assertEquals(new Chance(0,5 ), new Chance(7, 9).and(new Chance(0, 2)));
        assertTrue(new Chance(0, 5).equals(new Chance(0, 18)));
        assertTrue(new Chance(5, 5).equals(new Chance(18, 18)));
    }

    @Test
    public void testShouldKnowThatAChanceAndAChanceAreNotEqual() throws Exception {
        assertEquals(new Chance(1, 4).not(), new Chance(3, 4));
    }

    @Test
    public void testShouldKnowThatChanceIsNotEqualToAnotherChance() throws Exception {
        assertNotEquals(new Chance(3, 4).not(), new Chance(3, 4));
    }

    @Test
    public void testShouldKnowThatChanceIsNotEqualToAnotherChanceWithSameTotalNumberOfOccurrences() throws Exception {
        assertEquals(new Chance(2, 5).not(), new Chance(3, 5));
    }

    @Test
    public void testShouldKnowThatAChanceOfNotOccurringIsEqualToAChanceOfNotOccurring() throws Exception {
        assertEquals(new Chance(2, 58).not(),new Chance(2, 58).not());
    }

    @Test
    public void testShouldKnowThatAChanceOfNotOccurringIsNotEqualToAChanceOfNotOccurring() throws Exception {
        assertNotEquals(new Chance(1, 6).not(),new Chance(5, 6).not());
    }

    @Test
    public void testShouldKnowThatANotNotChanceIsEqualToAChance() throws Exception {
        assertEquals(new Chance(1, 4).not().not(), new Chance(1, 4));
    }

    @Test
    public void testShouldKnowThatANotNotChanceIsNotEqualToAChance() throws Exception {
        assertNotEquals(new Chance(1, 4).not().not(), new Chance(3, 4));
    }

    @Test
    public void testShouldKnowThatANotNotNotChanceIsEqualToAChance() throws Exception {
        assertEquals(new Chance(1, 4).not().not().not(), new Chance(3, 4));
    }

    @Test
    public void testShouldKnowThatANotNotNotChanceIsNotEqualToAChance() throws Exception {
        assertNotEquals(new Chance(1, 4).not().not().not(), new Chance(1, 4));
    }

    @Test
    public void testShouldKnowThatAChanceOrAChanceIsEqualToAChance() throws Exception {
        assertEquals(new Chance(5, 6).or(new Chance(1, 6)), new Chance(1, 6));
    }
    @Test
    public void testShouldKnowThatAChanceOrAChanceIsNotEqualToAChance() throws Exception {
        assertNotEquals(new Chance(5, 6).or(new Chance(3, 6)), new Chance(1, 6));
    }
}