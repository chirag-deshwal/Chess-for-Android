package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.ArrayDimensionConverter;
import com.example.chessforandroid.Position;
import com.example.chessforandroid.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class King extends AbstractPiece {

    public King(int color) {
        super(color);
        if (color == Color.WHITE){
            this.imageID = R.drawable.w_king;
        } else {
            this.imageID = R.drawable.b_king;
        }
    }

    @Override
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {
        ArrayList<Integer> aloudMoves = new ArrayList<>();

        Position temp2D = ArrayDimensionConverter.pieceToTwoDimension(position);

        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-1, temp2D.r));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-1, temp2D.r+1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c, temp2D.r+1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+1, temp2D.r+1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+1, temp2D.r));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+1, temp2D.r-1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c, temp2D.r-1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-1, temp2D.r-1));
        return aloudMoves;

    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black King";
        }else {
            return "White King";
        }
    }
}
