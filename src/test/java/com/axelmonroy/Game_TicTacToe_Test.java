package com.axelmonroy;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by axelmonroyx on 19/09/16.
 * https://github.com/AxelMonroyX
 */
public class Game_TicTacToe_Test {

    @Test
    public void testGameHumanWins() {

        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(3);
        mynewgame.cpuSelectPosition(7);
        mynewgame.humanSelectPosition(4);
        mynewgame.cpuSelectPosition(0);
        mynewgame.humanSelectPosition(5);
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
        assertTrue(mynewgame.someoneWins());
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
        assertFalse(mynewgame.someoneWins());
        assertEquals("no one wins :( ", mynewgame.checkWhoWins());

    }

    @Test
    public void noOneWins() {
        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(4);
        assertFalse(mynewgame.someoneWins());

    }

    @Test
    public void cpuSelectInTheMiddleIfCan(){
        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(1);
        mynewgame.selectSmartPosition();
        assertEquals("cpu", mynewgame.actualGame[4]);

    }




}
