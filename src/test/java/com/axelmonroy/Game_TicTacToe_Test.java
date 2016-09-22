package com.axelmonroy;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by axelmonroyx on 19/09/16.
 * https://github.com/AxelMonroyX
 */
public class Game_TicTacToe_Test {

    @Test
    public void testGameHumanWins() {

        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(4);
        mynewgame.cpuSelectPosition(8);
        mynewgame.humanSelectPosition(5);
        mynewgame.cpuSelectPosition(1);
        mynewgame.humanSelectPosition(3);
        assertEquals(true, mynewgame.someoneWins());
        assertEquals("HUMAN wins!", mynewgame.checkWhoWins());

    }

    @Test
    public void testGameHumanWins2() {

        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(4);
        mynewgame.cpuSelectPosition(8);
        mynewgame.humanSelectPosition(1);
        mynewgame.cpuSelectPosition(2);
        mynewgame.humanSelectPosition(7);
        assertEquals(true, mynewgame.someoneWins());
        assertEquals("HUMAN wins!", mynewgame.checkWhoWins());

    }


    @Test
    public void testGameFullBoard() {

        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(4);
        mynewgame.cpuSelectPosition(1);
        mynewgame.humanSelectPosition(2);
        mynewgame.cpuSelectPosition(0);
        mynewgame.humanSelectPosition(7);
        mynewgame.cpuSelectPosition(5);
        mynewgame.humanSelectPosition(3);
        mynewgame.cpuSelectPosition(6);
        mynewgame.humanSelectPosition(8);
        assertEquals(false, mynewgame.someoneWins());
        assertEquals("no one wins :( ", mynewgame.checkWhoWins());

    }




}
