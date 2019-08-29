package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Tools.ArrayDimensionConverter;
import com.example.chessforandroid.GameObjects.Position;
import com.example.chessforandroid.R;

import java.util.ArrayList;

public class Rook extends AbstractPiece {

    public Rook(int color) {

        super(color);

        if (color == Color.WHITE){
            this.imageID = R.drawable.w_rook;
        } else {
            this.imageID = R.drawable.b_rook;
        }
    }

    @Override
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {

        ArrayList<Integer> aloudMoves = new ArrayList<>();
        Position temp = ArrayDimensionConverter.pieceToTwoDimension(position);

        for (int i = 0; i < 8; i++){

            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c, temp.r-i));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c, temp.r+i));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r));
            aloudMoves.add(ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r));
        }

        return aloudMoves;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Rook";
        }else {
            return "White Rook";
        }
    }
}