package com.axelmonroy;

import javax.swing.*;

/**
 * Silly  Tic-Tac-Toe - By Axel!
 *
 */
public class App 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Silly  Tic-Tac-Toe - By Axel");
        frame.setContentPane(new Client_Tic_Tac_Toe().JPanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
