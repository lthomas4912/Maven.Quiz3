package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    static char [] vowels = {'a', 'e','i', 'o', 'u'};


    public static Boolean hasVowels(String word) {


        return null;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowels(c)) {
                return word.indexOf(c);
            }
        }
        return null;
    }

    private static boolean isVowels(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }


    public static Boolean startsWithVowel(String word) {
        for (int i = 0; i < vowels.length; i++) {
            char b = vowels[i];
            if(word.indexOf(0) == b)
            return true;
         }
        return false;
        }



        public static Boolean isVowel(Character character){
                for(int i = 0; i < vowels.length; i ++){
                    char c = vowels[i];
                    for(Character b : vowels){
                        if(b == c){
                            return true;
                        }
                    }
                }return false;
        }
    }

