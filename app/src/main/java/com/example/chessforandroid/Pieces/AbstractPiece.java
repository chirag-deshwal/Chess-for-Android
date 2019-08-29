package com.example.chessforandroid.Pieces;

import java.util.ArrayList;

public abstract class AbstractPiece {

    public int color;
    public int imageID;

    public AbstractPiece(int color) {
        this.color = color;
    }

    public abstract ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board);

}
