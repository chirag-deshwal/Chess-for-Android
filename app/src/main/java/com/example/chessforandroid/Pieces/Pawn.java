package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.ArrayDimensionConverter;
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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {
        ArrayList<Integer> aloudMoves = new ArrayList<>();
        Position temp = ArrayDimensionConverter.pieceToTwoDimension(position);
        // If starting position
        if (position == 48 || position == 49 || position == 50 || position == 51 || position == 52 || position == 53 || position == 54 || position == 55){
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c-1, temp.r));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c-2, temp.r));
        }
        // TODO: Attacking to the left

        // TODO: Attacking to the right

        // Anywhere else on the board
        else {
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c-1, temp.r));
        }

        return aloudMoves;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Pawn";
        } else {
            return "White Pawn";
        }
    }
}
