package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    private char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public String translate(String str) {
//         int start = 0;
//         int first = 0;
//         int end = 0;
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (VowelUtils.startsWithVowel(word)) {
                builder.append(word + "way" + " ");
            } else {
                int vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == -1) {
                    builder.append(word + "ay" + " ");
                } else {
                    String start = word.substring(0, vowelIndex);
                    String end = word.substring(vowelIndex);
                    String finalWord = end + start + "ay";
                    builder.append(finalWord + " ");

                }
            }

        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}

