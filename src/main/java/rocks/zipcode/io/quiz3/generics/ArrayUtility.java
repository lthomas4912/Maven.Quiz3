package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {

    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        int count = 0;

        for(SomeType element : array){
            if((getNumberOfOccurrences(element))%2 == 1){
                array[count] = element;
                count++;
            }
         }
            return null;
    }

    public SomeType findEvenOccurringValue() {
        int count = 0;
        SomeType [] otherArray = array.clone();
        for(SomeType element : otherArray){
            if((getNumberOfOccurrences(element))%2 == 0){
                otherArray[count] = element;
                count++;
            }
        }

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for(SomeType element : array){
            if(element == valueToEvaluate){
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }


}
