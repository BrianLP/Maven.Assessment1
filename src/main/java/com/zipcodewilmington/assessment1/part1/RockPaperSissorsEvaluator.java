package com.zipcodewilmington.assessment1.part1;

import java.util.Scanner;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String result = "";
        if (handSign == ROCK) {
            result = PAPER;
        }
        if (handSign == PAPER) {
            result = SCISSOR;
        }
        if (handSign == SCISSOR) {
            result = ROCK;
        }
        return result;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String result = "";
        if (handSign == ROCK) {
            result = SCISSOR;
        }
        if (handSign == PAPER) {
            result = ROCK;
        }
        if (handSign == SCISSOR) {
            result = PAPER;
        }
        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String result = "";
        if (getWinningMove(handSignOfPlayer1) == handSignOfPlayer2) {
            result = handSignOfPlayer2;
        } else if (getWinningMove(handSignOfPlayer2) == handSignOfPlayer1){
                result = handSignOfPlayer1;
        }

        return result;
    }
}