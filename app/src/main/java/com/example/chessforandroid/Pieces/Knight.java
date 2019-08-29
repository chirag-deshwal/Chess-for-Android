package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Tools.ArrayDimensionConverter;
import com.example.chessforandroid.GameObjects.Position;
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
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {

        ArrayList<Integer> aloudMoves = new ArrayList<>();
        Position temp2D = ArrayDimensionConverter.pieceToTwoDimension(position);

        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-2, temp2D.r-1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-2, temp2D.r+1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+2, temp2D.r-1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+2, temp2D.r+1));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-1, temp2D.r+2));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c-1, temp2D.r-2));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+1, temp2D.r+2));
        aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp2D.c+1, temp2D.r-2));

        return aloudMoves;
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