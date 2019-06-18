package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WordListUtilTest {

    @Test
    public void shouldCheckIfWordListContainFailCase() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("a", "what", "an", "nice", "day"), "dawhaty");
        Assert.assertFalse(b);
    }

    @Test
    public void shouldCheckIfWordListContainsCaseSecond() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("a", "ab", "bc"), "abc");
        Assert.assertTrue(b);
    }

    @Test
    public void shouldCheckIfWordListContainsCaseForth() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("ab", "dfdff", "df", "mk", "lal", "jjjjjl", "7", "rrrrrrrrrrr"),
                "dfdff7mk77abmklal777");
        Assert.assertTrue(b);
    }

    @Test
    public void shouldCheckIfWordListContainsCaseFifth() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("ni", "a", "what", "wh", "an", "nice", "day"), "whataniceday");
        Assert.assertTrue(b);
    }
}
