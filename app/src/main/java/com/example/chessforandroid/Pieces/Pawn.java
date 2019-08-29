package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Tools.ArrayDimensionConverter;
import com.example.chessforandroid.GameObjects.Position;
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

        // If starting position
        if (position == 48 || position == 49 || position == 50 || position == 51 || position == 52 || position == 53 || position == 54 || position == 55){
            aloudMoves.add(position - 8);
            aloudMoves.add(position - 16);
        }
        // Not starting position
        else {
            aloudMoves.add(position - 8);
        }
        // Attack Left
        if (board[position-9] != null){
            aloudMoves.add(position-9);
        }
        // Attack Right
        if (board[position-7] != null){
            aloudMoves.add(position-7);
        }

        // TODO: Include shadow attack rule

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
