package com.patrick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversion {

    // to see demonstration of this function, refer to the unit test class
    public static List<String> listAllPossible(int[] inputArray) {
        List<Integer> list = new ArrayList<>();
        for(int i:inputArray){
            list.add(i);
        }
        List<String> result = listAllPossible(list);
        Collections.sort(result);
        return result;
    }

    private static List<String> listAllPossible(List<Integer> digits) {
        // empty case
        if (digits.size() == 0) {
            ArrayList<String> baseRes = new ArrayList<>();
            baseRes.add("");
            return baseRes;
        }

        // Start with first digit in the list
        Integer digit = digits.get(0);

        List<Integer> remainingDigits = digits.subList(1, digits.size());

        List<String> prevBuilder = listAllPossible(remainingDigits);
        List<String> resultBuilder = new ArrayList<>();

        String mappedLetters = PropertiesUtil.getValue(digit);

        for (String val : prevBuilder) {

            for (int i = 0; i < mappedLetters.length(); i++) {
                resultBuilder.add(mappedLetters.charAt(i) + val);
            }
        }
        return resultBuilder;
    }

}
