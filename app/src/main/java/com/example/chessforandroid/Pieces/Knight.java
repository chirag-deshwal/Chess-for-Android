package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

public class Knight extends AbstractPiece {

    public Knight(int color) {
        super(color);
        if (color == Color.WHITE){
            this.imageID = R.drawable.w_knight;
        } else {
            this.imageID = R.drawable.b_knight;
        }
    }
    @Override
    public void getRules() {

    }
}