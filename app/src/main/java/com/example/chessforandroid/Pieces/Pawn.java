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
        Position temp = ArrayDimensionConverter.pieceToTwoDimension(position);

        // If starting position
        if (position == 48 || position == 49 || position == 50 || position == 51 || position == 52 || position == 53 || position == 54 || position == 55){
            if (board[position-8] == null){
                aloudMoves.add(position - 8);
            }
            if (board[position-16] == null){
                aloudMoves.add(position - 16);
            }
        }
        // Not starting position
        else {
            if (board[position-8] == null){
                aloudMoves.add(position - 8);
            }
        }
        // Attack Left
        if (board[position-9] != null && board[position-9].color != board[position].color){
            aloudMoves.add(position-9);
        }
        // Attack Right
        if (board[position-7] != null && board[position-7].color != board[position].color){
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
