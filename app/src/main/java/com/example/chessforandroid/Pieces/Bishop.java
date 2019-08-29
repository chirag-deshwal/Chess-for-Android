package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.ArrayDimensionConverter;
import com.example.chessforandroid.Position;
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
        for (int i = 0; i < 8; i++){
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r-i));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r+i));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r-i));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r+i));
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