package com.example.ankit.tictactoe;

/**
 * Created by ankit on 17/1/18.
 */

public class GameHex {
    private String[][] hex = new String[3][3];
    GameHex() {

//Initiate the game board with blanks
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                hex[i][j] = "";
            }

        }

    }
    public void clear() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                hex[i][j] = "";

            }

        }

    }
    public String[][] getBoard() {

        return hex;

    }

    public void placeMark(int xxl, int yyl, String mark) {

        if (hex[xxl][yyl] == "") hex[xxl][yyl] = mark;

    }
    public boolean isWinner() {

// Check Diagonals
        if (hex[0][0] == hex[1][1] && hex[0][0] == hex[2][2] && hex[0][0] != "")

            return true;

        if (hex[2][0] == hex[1][1] && hex[2][0] == hex[0][2] && hex[2][0] != "")

            return true;

        for (int i = 0; i < 3; i++) {

// Check Rows
            if (hex[i][0] == hex[i][1] && hex[i][1] == hex[i][2] && hex[i][0] != "")

                return true;

// Check Columns
            if (hex[0][i] == hex[1][i] && hex[1][i] == hex[2][i] && hex[0][i] != "")

                return true;

        }

        return false;
    }

}
