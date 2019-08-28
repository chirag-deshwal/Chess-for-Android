package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Integer;
import com.example.chessforandroid.R;

import java.util.ArrayList;

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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[][] board) {
        ArrayList<Integer> aloudMoves = new ArrayList<>();
        return aloudMoves;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Pawn";
        }else {
            return "White Pawn";
        }
    }
}
