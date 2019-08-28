package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

public class Bishop extends AbstractPiece {

    public Bishop(int color) {

        super(color);

        if (color == Color.WHITE){
            this.imageID = R.drawable.w_bishop;
        } else {
            this.imageID = R.drawable.b_bishop;
        }
    }
    @Override
    public void getRules() {

    }
}