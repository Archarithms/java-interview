package com.github.archarithms.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.github.archarithms.App;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DateStringTests unit tests for simple App.
 */
public class DateStringTests {

    @Test
    @Disabled
    public void testConvertUnixToDateString() {
        String testStr = "July 4, 2017";
        assertEquals(testStr, App.convertUnixToDateString(1499144400L));
    }

    @Test
    @Disabled
    public void testNullCase() {
        assertThrows(Exception.class, () -> App.convertUnixToDateString(null));
    }
}
