package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WordListUtilTest {

    @Test
    public void wordExistsInWordTheList() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("whataniceday", "dayByDay", "aaa"), "whataniceday");
        Assert.assertTrue(b);
    }

    @Test
    public void wordCanBeContractedExactlyFromWordList() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("what", "a", "nice", "day", "Samvel!"), "whataniceday");
        Assert.assertTrue(b);
    }

    @Test
    public void shouldCheckIfWordListContainsFirstCase() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("a", "ab", "bc"), "abcaab");
        Assert.assertTrue(b);
    }

    @Test
    public void shouldCheckIfWordListContainsSecondCase() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("a", "ab", "bc"), "abc");
        Assert.assertTrue(b);
    }

    @Test
    public void shouldCheckIfWordListContainsThirdCase() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("ni", "a", "what", "wh", "an", "nice", "day"), "whataniceday");
        Assert.assertTrue(b);
    }

    @Test
    public void shouldCheckIfWordListContainFailCase() {
        WordListUtil util = new WordListUtil();
        boolean b = util.hasElement(Arrays.asList("a", "what", "an", "nice", "day"), "dawhaty");
        Assert.assertFalse(b);
    }
}
