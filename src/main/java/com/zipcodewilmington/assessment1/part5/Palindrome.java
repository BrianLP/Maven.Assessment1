package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+3; j < input.length(); j++) {
                if (input.substring(i).length() > 1) {
                    if (input.charAt(j) == input.charAt(input.length() - j)) {
                        count += 1;

                    }
                }
            }

        }
        return null;
    }
}
