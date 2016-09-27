package com.axelmonroy;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by axelmonroyx on 19/09/16.
 * https://github.com/AxelMonroyX
 */
class Game_TicTacToe {
    String[] actualGame = new String[9];
    List<String> winnerPositions = new LinkedList<String>();


    private String lastPlayer;

    public Game_TicTacToe() {
        winnerPositions.add("0,1,2");
        winnerPositions.add("0,4,8");
        winnerPositions.add("0,3,6");
        winnerPositions.add("1,4,7");
        winnerPositions.add("2,4,6");
        winnerPositions.add("2,5,8");
        winnerPositions.add("3,4,5");

    }

    void humanSelectPosition(int positionSelectedByHuman) {

        selectPosition(positionSelectedByHuman, "human");
    }


    void cpuSelectPosition(int positionSelectedByCPU) {
        selectPosition(positionSelectedByCPU, "cpu");
    }

    int selectRandomPosition() {
        Random rnd = new Random();
        int positionSelectedByCPU = ((int) (rnd.nextDouble() * 9 + 1)) - 1;
//        System.out.println(positionSelectedByCPU);
        if (actualGame[positionSelectedByCPU] == null) {
            cpuSelectPosition(positionSelectedByCPU);
        } else {
            positionSelectedByCPU = selectRandomPosition();
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
        for (String position : this.winnerPositions) {
            for (int i = 0; i < this.actualGame.length; i++) {

                if ((this.actualGame[i] != null) && (this.actualGame[i].equals(this.lastPlayer))) {

                    String[] positionINT = position.split(",");
                    if (i == Integer.parseInt(positionINT[0])) counter++;
                    if (i == Integer.parseInt(positionINT[1])) counter++;
                    if (i == Integer.parseInt(positionINT[2])) counter++;

                }
            }
            if (counter == 3) return true;
            counter = 0;

        }

        return false;
    }


    public boolean fullBoard() {
        int counterWithContenent = 0;
        for (String anActualGame : this.actualGame) {
            if (anActualGame != null) counterWithContenent++;
        }
        return counterWithContenent == this.actualGame.length;
    }

    public int selectSmartPosition() {
        int middleOfGame = 4;
        if (actualGame[middleOfGame] == null) {
            cpuSelectPosition(middleOfGame);
        } else {
            middleOfGame = selectRandomPosition();
        }
        return middleOfGame;

    }
}
