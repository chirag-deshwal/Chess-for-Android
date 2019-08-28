package com.example.chessforandroid.Pieces;

import com.example.chessforandroid.Position;

import java.util.ArrayList;

public abstract class AbstractPiece {

    public int color;
    public int imageID;

    public AbstractPiece(int color) {
        this.color = color;
    }

    public abstract ArrayList<Position> getAloudMoves(Position position, AbstractPiece[][] board);

}
