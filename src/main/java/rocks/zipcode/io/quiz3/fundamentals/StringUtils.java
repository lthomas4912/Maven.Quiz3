package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        str = str.substring(indexToCapitalize).toUpperCase() + str.substring(1);
        return str;

    }



    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        StringBuilder word = new StringBuilder(baseString);

        return true;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList array = new ArrayList(string.length());
        for (int i = 0; i < string.length() ; i++) {
            for (int j = i+1; j <string.length() ; j++) {
                string = string.substring(i, j);
             }
            }
        return null;

    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
