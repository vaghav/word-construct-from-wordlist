package com;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class WordListUtil {

    public boolean hasElement(List<String> wordList, String word) {

        if (word.isEmpty()) {
            throw new IllegalArgumentException("Given string can't be empty");
        }

        Set<String> wordSet = new HashSet<>(wordList);
        List<String> matched = wordSet.stream().filter(word::startsWith).collect(toList());

        for (String item : matched) {
            String formatted = word.replaceFirst(item, "");
            if (formatted.isEmpty() || hasElement(wordList, formatted)) {
                return true;
            }
        }
        return false;
    }
}
