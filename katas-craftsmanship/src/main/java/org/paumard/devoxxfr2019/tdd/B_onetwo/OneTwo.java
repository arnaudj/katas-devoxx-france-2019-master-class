/*
 * Copyright (C) 2019 José Paumard
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.paumard.devoxxfr2019.tdd.B_onetwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OneTwo {

    static Map digitToWord = new HashMap<String, String>();  // use Guava bimap
    static Map word2Digit = new HashMap<String, String>();

    static {
        addMapping("1", "one");
        addMapping("2", "two");
        addMapping("3", "three");
        addMapping("4", "four");
        addMapping("5", "five");
        addMapping("6", "six");
        addMapping("7", "seven");
        addMapping("8", "eight");
        addMapping("9", "nine");
    }

    static void addMapping(String a, String b) {
        digitToWord.put(a, b);
        word2Digit.put(b, a);
    }

    public String convertToNames(String in) {
        String[] split = in.split("\\s+");
        return convertNamesStream(split);
    }

    class WordCount { // Pair
        int count;
        String word;

        WordCount(int count, String word) {
            this.count = count;
            this.word = word;
        }
    }

    // with sequence compression - TODO handle case should_return_nine_five_three_five_for_5_5_5_5_5_5_5_5_5_5_5_5
    private String convertNamesStream(String[] split) {
        List<String> words = Arrays.asList(split).stream()
                .map(item -> digitToWord.get(item).toString())
                .collect(Collectors.toList());

        return compressSequence(words).stream()
                .map(wc -> digitToWord.get(wc.count + "") + " " + wc.word)
                .collect(Collectors.joining(" "));
    }

    private ArrayList<WordCount> compressSequence(List<String> words) {
        ArrayList<WordCount> wordCounts = new ArrayList<>();

        String word = words.get(0);
        int count = 1;
        for (int i = 1; i < words.size(); i++) {
            String newWord = words.get(i);
            if (newWord.equals(word)) {
                count++;
                continue;
            }

            wordCounts.add(new WordCount(count, word));
            word = newWord;
            count = 1;
        }

        wordCounts.add(new WordCount(count, word));

        return wordCounts;
    }

    public String convertToFigures(String input) {
        return null; // TODO
    }
}
