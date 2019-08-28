package com.example.chessforandroid.Pieces;

import android.graphics.Color;

public abstract class AbstractPiece {

    public int color;
    public int imageID;

    public AbstractPiece(int color) {
        this.color = color;
    }

    public abstract void getRules();

}
