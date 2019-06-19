package CodingInterview.ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class Example_1_1Test {

    Example_1_1 example = new Example_1_1();

    @Test
    public void isDuplicateByAscii() {

        assertTrue(example.isDuplicateByAscii("ShowMeTheMoney"));
        assertTrue(example.isDuplicateByAscii("InterView Coding"));
        assertTrue(example.isDuplicateByAscii("A B C"));
        assertFalse(example.isDuplicateByAscii("aAbBcCd DeEfFgG"));
    }
}