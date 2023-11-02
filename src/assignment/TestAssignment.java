package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestAssignment {
    @Test
    public void testCharCounter() {
        Counter counter = new Counter();
        int expected = 3;
        int actual = counter.getCharCounter("hi!");

        assertEquals(expected, actual);
    }

    @Test
    public void testWordCounter() {
        Counter counter = new Counter();
        int expected = 3;
        int actual = counter.getWordCounter("Hello Mr. Bond");

        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord() {
        Counter counter = new Counter();
        String expected = "programmer";
        String actual = counter.getLongestWord("Hello fellow programmer");

        assertEquals(expected, actual);
    }

    @Test
    public void testStopCheck() {
        Counter counter = new Counter();
        boolean expected = true;
        boolean actual = counter.getStopCheck("stop");

        assertEquals(expected, actual);
    }

   /* @Test //Osäker om det är såhär man ska testa denna men gör ett försök.
    public void testLineCounter(){
        Counter counter = new Counter();
        int expected = 4;
        int actualTest = 1;
        int actual = counter.getLineCounter();

        for(int i = 0; i<4; i++){
          actual = actualTest + actual;
        }
        assertEquals(expected, actual);

    }*/

}
