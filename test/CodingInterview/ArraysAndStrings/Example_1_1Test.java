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

    @Test
    public void sort() {
        Character[] chars = {'a', 'c', 'b', 'A'};
        Character[] expected = {'A', 'a', 'b', 'c'};

        example.sort(chars, 0, chars.length - 1);
        assertArrayEquals(expected, chars);

        Character[] chars1 = {'a', 'c', 'b', 'A', 'a'};
        Character[] expected1 = {'A', 'a', 'a', 'b', 'c'};
        example.sort(chars1, 0, chars1.length - 1);
        assertArrayEquals(expected1, chars1);

    }

    @Test
    public void isFindDuplicate() {
        Character[] expected = {'A', 'a', 'b', 'c'};
        Character[] expected1 = {'A', 'a', 'a', 'b', 'c'};

        assertFalse(example.isFindDuplicate(expected));
        assertTrue(example.isFindDuplicate(expected1));

    }
}