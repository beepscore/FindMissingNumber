package com.beepscore.android.findmissingnumber;

/**
 * Created by stevebaker on 5/29/15.
 */
public class MissingNumberFinder {

    /** Finds the missing number
     *
     * @param numbers is an array of integers from minimum to maximum, inclusive.
     *                Elements may appear in any order. No duplicates.
     *                One number in the range is missing. Could be "maximum" or minimum" too.
     * @param minimum is the minimum of the inclusive range. May or may not be in numbers.
     * @return the number missing from numbers
     */
    public int findMissingNumber(int[] numbers, int expectedMinimum) {

        int result = 0;

        for (int index = 0; index < numbers.length; ++index) {

            // add expected in numerical order.
            // Order doesn't matter, and this is convenient.
            int nextExpectedNumber = expectedMinimum + index;
            result += nextExpectedNumber;

            // subtract actual in the order they appear in array
            int nextActualNumber = numbers[index];
            result -= nextActualNumber;
        }

        // expected has one more number than actual numbers
        // add the last expected number
        result += expectedMinimum + numbers.length;

        return result;
    }

}
