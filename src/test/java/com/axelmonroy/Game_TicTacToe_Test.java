package com.axelmonroy;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by axelmonroyx on 19/09/16.
 */
public class Game_TicTacToe_Test {

    @Test
    public void testGame() {

        Game_TicTacToe mynewgame = new Game_TicTacToe();
        mynewgame.humanSelectPosition(4);
        mynewgame.cpuSelectPosition(8);
        mynewgame.humanSelectPosition(5);
        mynewgame.cpuSelectPosition(1);
        mynewgame.humanSelectPosition(3);
        assertEquals(true, mynewgame.someoneWins());
        assertEquals("Human Wins !", mynewgame.checkWhoWins());

    }


}
