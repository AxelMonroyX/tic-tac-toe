package com.axelmonroy;

/**
 * Created by axelmonroyx on 19/09/16.
 */
public class Game_TicTacToe {
    public double checkWhoWins;


    public void humanSelectPosition(int positionSelectedByHuman) {
        selectPosition(positionSelectedByHuman, "human");
    }


    public void cpuSelectPosition(int positionSelectedByCPU) {
        selectPosition(positionSelectedByCPU, "cpu");
    }

    private void selectPosition(int positionSelectedByHuman, String who) {
    }

    public String checkWhoWins() {

        return "";
    }

    public boolean someoneWins() {
        return false;
    }
}
