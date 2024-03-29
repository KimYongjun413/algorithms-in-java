package CodingInterview.ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class Example_1_2Test {

    Example_1_2 test = new Example_1_2();

    @Test
    public void permutationTest() {

        assertFalse(test.isPermutation("abcd","abc"));
        assertFalse(test.isPermutation("Aaa b","Aaab"));

        assertTrue(test.isPermutation("abc","abc"));
        assertTrue(test.isPermutation("abc","bca"));
        assertTrue(test.isPermutation("Aaa b","aaAb "));


        assertFalse(test.permutation("abcd","abc"));
        assertFalse(test.permutation("Aaa b","Aaab"));

        assertTrue(test.permutation("abc","abc"));
        assertTrue(test.permutation("abc","bca"));
        assertTrue(test.permutation("Aaa b","aaAb "));

    }



}