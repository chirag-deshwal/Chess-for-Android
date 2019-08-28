package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

public class Rook extends AbstractPiece {

    public Rook(int color) {

        super(color);

        if (color == Color.WHITE){
            this.imageID = R.drawable.w_rook;
        } else {
            this.imageID = R.drawable.b_rook;
        }
    }

    @Override
    public void getRules() {

    }
}