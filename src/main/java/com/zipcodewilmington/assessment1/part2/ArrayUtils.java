package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object s : objectArray) {
            if (s.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> arrList = new ArrayList<>(Arrays.asList(objectArray));
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i).equals(objectToRemove)) {
                arrList.remove(arrList.get(i));
            }
        }
        return arrList.toArray(new Integer[arrList.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int count1 = 1;
        int newMax = 1;
        Object mostFrequent = objectArray[0];
        for (int i = 1; i < objectArray.length; i++) {
            if (objectArray[i] == objectArray[i - 1]) {
                count1++;
            } else {
                if (count1 > newMax) {
                    newMax = count1;
                    mostFrequent = objectArray[i - 1];
                }
                count1 = 1;
            }
            if (count1 > newMax) {
                mostFrequent = objectArray[objectArray.length - 1];

            }
        }
        return mostFrequent;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Arrays.sort(objectArray);
        int count1 = 1;
        int newMax = objectArray.length;
        Object leastFrequent = objectArray[0];
        for (int i = 1; i < objectArray.length; i++) {
            return null;
        }
        return null;
    }

            /**
             * @param objectArray      an array of any type of Object
             * @param objectArrayToAdd an array of Objects to add to the first argument
             * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
             * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
             */
            public static Object[] mergeArrays (Object[]objectArray, Object[]objectArrayToAdd){
                ArrayList<Object> arrList = new ArrayList<>(Arrays.asList(objectArray));
                ArrayList<Object> arrList2 = new ArrayList<>(Arrays.asList(objectArrayToAdd));
                arrList.addAll(arrList2);
                return arrList.toArray(new Integer[arrList.size()]);

            }
        }

