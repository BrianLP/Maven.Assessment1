package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */

    public int jumps(int k, int j) {
        int baseJumps = 0;

        for (int i = 1; i < k; i++) {


            if (k / (i * j) >= 1) {
                baseJumps = i;
            } else {
                break;
            }
        }
        int singleJumps = k - (baseJumps * j);

        return singleJumps + baseJumps;
    }
}
