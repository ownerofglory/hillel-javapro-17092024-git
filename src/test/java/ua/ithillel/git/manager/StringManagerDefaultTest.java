package ua.ithillel.git.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringManagerDefaultTest {
    private StringManager stringManager;

    @Test
    public void stringLenTest() {
        stringManager = new StringManagerDefault();

        String testInput = "Hello";
        int expectedLen = testInput.length();

        int actualLen = stringManager.stringLen(testInput);

        Assertions.assertEquals(expectedLen, actualLen);
    }
}
