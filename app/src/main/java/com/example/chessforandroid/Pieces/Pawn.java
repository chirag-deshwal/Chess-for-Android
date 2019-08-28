package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Position;
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
    public ArrayList<Position> getAloudMoves(Position position, AbstractPiece[][] board) {
        ArrayList<Position> aloudMoves = new ArrayList<>();
        aloudMoves.add(new Position(position.column + 1, position.row));
        aloudMoves.add(new Position(position.column + 2, position.row));
        System.out.println("Aloud Moves: "+aloudMoves.toString());
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
