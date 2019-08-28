package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Integer;
import com.example.chessforandroid.R;

import java.util.ArrayList;

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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[][] board) {
        return null;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Rook";
        }else {
            return "White Rook";
        }
    }
}