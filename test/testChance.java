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
    public void testIfChancesAreTheSame() throws Exception {
        assertEquals(new Chance(3,12), new Chance(3,12));
    }

    @Test
    public void testTwoChancesThatAreNotTheSame() throws Exception {
        assertNotEquals(new Chance(31,62),new Chance(24,65));
    }
}
