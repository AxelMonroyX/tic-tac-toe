package com.axelmonroy;

import java.util.ArrayList;

/**
 * Created by axelmonroyx on 19/09/16.
 * https://github.com/AxelMonroyX
 */
class Game_TicTacToe {
    String[] actualGame = new String[9];

    ArrayList<int[]> winnerPositions = new ArrayList<int[]>();


    private String lastPlayer;

    public Game_TicTacToe() {
        winnerPositions.add(new int[]{0, 1, 2});
        winnerPositions.add(new int[]{0, 4, 8});
        winnerPositions.add(new int[]{0, 3, 6});
        winnerPositions.add(new int[]{1, 4, 7});
        winnerPositions.add(new int[]{2, 4, 6});
        winnerPositions.add(new int[]{2, 5, 8});
        winnerPositions.add(new int[]{3, 4, 5});
        winnerPositions.add(new int[]{6, 7, 8});


    }

    void humanSelectPosition(int positionSelectedByHuman) {

        selectPosition(positionSelectedByHuman, "human");
    }


    void cpuSelectPosition(int positionSelectedByCPU) {
        selectPosition(positionSelectedByCPU, "cpu");
    }

    int selectPositionByCorners() {
        int positionSelectedByCPU = 0;


        if (this.actualGame[0] == "human" | this.actualGame[2] == "human" | this.actualGame[6] == "human" | this.actualGame[8] == "human") {
            if (this.actualGame[0] == "human" && this.actualGame[8] == null) return 8;
            if (this.actualGame[8] == "human" && this.actualGame[0] == null) return 0;
            if (this.actualGame[2] == "human" && this.actualGame[6] == null) return 6;
            if (this.actualGame[6] == "human" && this.actualGame[2] == null) return 2;


        }
        if (this.actualGame[0] == "human" && this.actualGame[8] == "human") return 1;
        if (this.actualGame[8] == "human" && this.actualGame[0] == "human") return 1;
        if (this.actualGame[2] == "human" && this.actualGame[6] == "human") return 1;
        if (this.actualGame[6] == "human" && this.actualGame[2] == "human") return 1;


        if ( this.actualGame[0] == null) return 0;
        if ( this.actualGame[2] == null) return 2;
        if ( this.actualGame[6] == null) return 6;
        if ( this.actualGame[8] == null) return 8;





        for (int i = 0; i <= 8; i++) {
            if (actualGame[i] == null) return i;
        }


        return positionSelectedByCPU;

    }

    private void selectPosition(int positionSelected, String who) {
        if (actualGame[positionSelected] == null) {
            actualGame[positionSelected] = who;
            lastPlayer = who;
        }
    }

    String checkWhoWins() {
        if (someoneWins()) return this.lastPlayer.toUpperCase() + " wins!";

        return "no one wins :( ";
    }

    boolean someoneWins() {


        int counter = 0;
        for (int[] position : this.winnerPositions) {
            for (int i = 0; i < this.actualGame.length; i++) {

                if ((this.actualGame[i] != null) && (this.actualGame[i].equals(this.lastPlayer))) {

                    if (i == position[0]) counter++;
                    if (i == position[1]) counter++;
                    if (i == position[2]) counter++;

                }
            }
            if (counter == 3) return true;
            counter = 0;

        }

        return false;
    }


    public boolean fullBoard() {
        int counterWithContent = 0;
        for (String anActualGame : this.actualGame) {
            if (anActualGame != null) counterWithContent++;
        }
        return counterWithContent == this.actualGame.length;
    }

    public int selectSmartPosition() {
        int middleOfGame = 4;
        int positionSelectedCpu = 0;
        if (canWin("cpu")) {
            positionSelectedCpu = positionToWin("cpu");

        } else {
            if (canWin("human")) {
                positionSelectedCpu = positionToWin("human");
            } else {

                if (actualGame[middleOfGame] == null) {
                    positionSelectedCpu = middleOfGame;
                } else {
                    positionSelectedCpu = selectPositionByCorners();
                }
            }
        }

        if (actualGame[positionSelectedCpu] == null) {
            cpuSelectPosition(positionSelectedCpu);
        } else {
            positionSelectedCpu = selectPositionByCorners();
        }


        return positionSelectedCpu;


    }

    private int positionToWin(String player) {

        int counter = 0;
        int positionToWin = -1;
        for (int[] position : this.winnerPositions) {
            for (int i = 0; i < this.actualGame.length; i++) {

                if (i == position[0] | i == position[1] | i == position[2]) {
                    if (positionToWin != -1 && counter == 2) return positionToWin;

                    if (actualGame[i] == null) {
                        positionToWin = i;
                    } else if (actualGame[i].equals(player)) {
                        counter++;
                    }
                    if (positionToWin != -1 && counter == 2) return positionToWin;


                }
            }
            positionToWin = -1;
            counter = 0;
        }
        return 0;
    }

    public boolean canWin(String player) {
        int counter = 0;
        int positionToWin = -1;
        for (int[] position : this.winnerPositions) {
            for (int i = 0; i < this.actualGame.length; i++) {

                if (i == position[0] | i == position[1] | i == position[2]) {
                    if (positionToWin != -1 && counter == 2) return true;

                    if (actualGame[i] == null) {
                        positionToWin = i;
                    } else if (actualGame[i].equals(player)) {
                        counter++;
                    }
                    if (positionToWin != -1 && counter == 2) return true;


                }
            }
            positionToWin = -1;
            counter = 0;
        }
        return false;
    }

}
