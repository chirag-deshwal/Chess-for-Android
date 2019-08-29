package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Tools.ArrayDimensionConverter;
import com.example.chessforandroid.GameObjects.Position;
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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {
        ArrayList<Integer> aloudMoves = new ArrayList<>();
        Position temp = ArrayDimensionConverter.pieceToTwoDimension(position);

        // TODO: Gotta fix the way i do this
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r+i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r-i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r-i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r+i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                i = 8;
            }
        }
        return aloudMoves;
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