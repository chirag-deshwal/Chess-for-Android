package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

public class King extends AbstractPiece {

    public King(int color) {
        super(color);
        if (color == Color.WHITE){
            this.imageID = R.drawable.w_king;
        } else {
            this.imageID = R.drawable.b_king;
        }
    }
    @Override
    public void getRules() {

    }
}
