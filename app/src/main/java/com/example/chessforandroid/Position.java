package com.example.chessforandroid;

import java.util.ArrayList;

public class Position {

    public int column;
    public int row;

    public Position(int column, int row) {
        this.column = column;
        this.row = row;
    }


    @Override
    public String toString() {
        return "Column = " + column +
                "\nRow = " + row;
    }
    public static Position oneDtoTwoD(int i){
        int temp = 0;
        for (int c = 0; c < 8; c++){
            for (int r = 0; r < 8; r++){
                if (i == temp) {
                return new Position(c, r);
                }
                temp++;
            }
        }
        return new Position(0, 0);
    }
}
