package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.R;

import java.util.ArrayList;

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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {
        return null;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black King";
        }else {
            return "White King";
        }
    }
}
