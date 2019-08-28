package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Integer;
import com.example.chessforandroid.R;

import java.util.ArrayList;

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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[][] board) {
        return null;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Queen";
        }else {
            return "White Queen";
        }
    }
}