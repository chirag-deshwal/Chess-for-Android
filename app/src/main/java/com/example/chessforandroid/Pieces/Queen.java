package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

public class Queen extends AbstractPiece {

    public Queen(int color) {

        super(color);

        if (color == Color.WHITE){
            this.imageID = R.drawable.w_queen;
        } else {
                this.imageID = R.drawable.b_queen;
        }
    }
    @Override
    public void getRules() {

    }
}