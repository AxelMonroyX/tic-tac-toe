package com.axelmonroy;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Client_Tic_Tac_Toe");
        frame.setContentPane(new Client_Tic_Tac_Toe().JPanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
