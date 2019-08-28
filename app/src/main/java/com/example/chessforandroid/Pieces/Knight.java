package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Position;
import com.example.chessforandroid.R;

import java.util.ArrayList;

public class Knight extends AbstractPiece {

    public Knight(int color) {
        super(color);
        if (color == Color.WHITE) {
            this.imageID = R.drawable.w_knight;
        } else {
            this.imageID = R.drawable.b_knight;
        }
    }

    @Override
    public ArrayList<Position> getAloudMoves(Position position, AbstractPiece[][] board) {
        return null;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Knight";
        }else {
            return "White Knight";
        }
    }
}