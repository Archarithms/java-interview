package com.github.archarithms.test;

import com.github.archarithms.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * DateStringTests unit tests for simple App.
 * Note: not sure how/why to write tests for "If no timestamp is given the function should return today’s date"
 *       With epoch time, any valid Long should have an equally valid date associated with it.
 *       Also -- the method signature stipulates a Long -- so testing for "incorrect type" seems redundant.
 *       Finally... I could involve BigInteger to verify that the Long is within bounds... but, that's a
 *       (relatively) expensive operation and my assumption is that we'd be checking that elsewhere (API boundary).
 */
public class DateStringTests {

    @Test
    public void testPositiveEpochTime() {
        String testStr = "July 4, 2017";
        assertEquals(testStr,App.convertUnixToDateString(1499144400L));
    }

    @Test
    public void testNegativeEpochTime() {
        String testStr = "October 3, 1918";
        assertEquals(testStr,App.convertUnixToDateString(-1617217129L));
    }

    @Test
    public void testNullCase() {
        assertThrows(IllegalArgumentException.class, () -> App.convertUnixToDateString(null));
    }
}
