package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

public class Pawn extends AbstractPiece {

    public Pawn(int color) {
        super(color);
        if (color == Color.WHITE){
            this.imageID = R.drawable.w_pawn;
        } else {
            this.imageID = R.drawable.b_pawn;
        }
    }

    @Override
    public void getRules() {

    }
}
