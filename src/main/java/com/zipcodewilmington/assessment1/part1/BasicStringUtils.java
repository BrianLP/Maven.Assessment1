package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String str2="";
        str2 += str.charAt(0);
        str2 = str.toUpperCase();
        for (int i = 1; i <= str.length(); i++) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String str2 = "";
        for (int i = str.length()-1; i>=0; i--){
            str2+=str.charAt(i);
        }
        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String str2 = "";
        for(int i = 1; i < str.length()-1; i++){
            str2+=str.charAt(i);
        }
        return str2;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++){

        }
        return str2;
    }
}
