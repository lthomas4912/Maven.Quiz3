package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    private char [] vowels = {'a','e','i','o','u'};

     public String translate(String str) {
         int start = 0;
         int first = 0;
         int end = 0;
         for(int i = 0 ; i < end; i++){
             char c = Character.toLowerCase(str.charAt(i));
                if(Arrays.asList(vowels).contains(c)){
                    first = i;

              }
         } if(start != first){
             String firstString = str.substring(first,end);
             String endString = str.substring(start, first) + "ay";
             return firstString+endString;
         }

        return str;
    }
}
