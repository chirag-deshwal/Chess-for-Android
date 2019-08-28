package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Integer;
import com.example.chessforandroid.R;

import java.util.ArrayList;

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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[][] board) {
        return null;
    }
    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Bishop";
        }else {
            return "White Bishop";
        }
    }
}