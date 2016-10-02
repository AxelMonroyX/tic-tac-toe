package com.axelmonroy;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by axelmonroyx on 19/09/16.
 * https://github.com/AxelMonroyX
 */
public class Client_Tic_Tac_Toe {
    public JPanel JPanelMain;
    private Game_TicTacToe myNewGame;
    private JButton position0;
    private JButton position1;
    private JButton position2;
    private JButton position3;
    private JButton position4;
    private JButton position5;
    private JButton position6;
    private JButton position7;
    private JButton position8;


    Client_Tic_Tac_Toe() {

        flushGame();
        position0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position0, 0);

            }
        });
        position1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position1, 1);
            }
        });
        position2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position2, 2);
            }
        });
        position3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position3, 3);
            }
        });
        position4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position4, 4);

            }
        });
        position5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position5, 5);

            }
        });
        position6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position6, 6);

            }
        });
        position7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position7, 7);

            }
        });
        position8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                buttonSelected(position8, 8);

            }
        });
    }

    private void buttonSelected(JButton buttonSelected, int position) {
        if (buttonSelected.getText().equals("")) {
            myNewGame.humanSelectPosition(position);
            buttonSelected.setText("X");
            buttonSelected.setBackground(Color.GREEN);
            buttonSelected.setEnabled(false);
            if (myNewGame.someoneWins()) {
                JOptionPane.showMessageDialog(null, myNewGame.checkWhoWins());
                flushGame();
            } else if (!myNewGame.someoneWins() & !myNewGame.fullBoard()) {
                int positionSelectedByCPU = myNewGame.selectSmartPosition();
                System.out.println(positionSelectedByCPU);
                switch (positionSelectedByCPU) {
                    case 0:
                        buttonSelectedByCPU(position0);
                        break;
                    case 1:
                        buttonSelectedByCPU(position1);
                        break;
                    case 2:
                        buttonSelectedByCPU(position2);
                        break;
                    case 3:
                        buttonSelectedByCPU(position3);
                        break;
                    case 4:
                        buttonSelectedByCPU(position4);
                        break;
                    case 5:
                        buttonSelectedByCPU(position5);
                        break;
                    case 6:
                        buttonSelectedByCPU(position6);
                        break;
                    case 7:
                        buttonSelectedByCPU(position7);
                        break;
                    case 8:
                        buttonSelectedByCPU(position8);
                        break;
                    default:
                        break;
                }
            }


            if (myNewGame.someoneWins()) {
                JOptionPane.showMessageDialog(null, myNewGame.checkWhoWins());
                flushGame();
            }
            if(myNewGame.fullBoard() && !myNewGame.someoneWins()){
                JOptionPane.showMessageDialog(null, myNewGame.checkWhoWins());
                flushGame();
            }

        }


    }

    private void buttonSelectedByCPU(JButton buttonSelected) {
        buttonSelected.setText("O");
        buttonSelected.setBackground(Color.RED);
        buttonSelected.setEnabled(false);
    }

    private void flushGame() {
        myNewGame = new Game_TicTacToe();

        flushButton(position0);
        flushButton(position1);
        flushButton(position2);
        flushButton(position3);
        flushButton(position4);
        flushButton(position5);
        flushButton(position6);
        flushButton(position7);
        flushButton(position8);
    }

    private void flushButton(JButton buttonToFlush) {
        buttonToFlush.setText("");
        buttonToFlush.setEnabled(true);
        buttonToFlush.setBackground(new Color(187, 187, 187));
    }

}
