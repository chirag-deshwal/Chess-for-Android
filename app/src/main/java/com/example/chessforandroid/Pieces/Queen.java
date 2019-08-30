package com.example.chessforandroid.Pieces;

import android.graphics.Color;

import com.example.chessforandroid.Tools.ArrayDimensionConverter;
import com.example.chessforandroid.GameObjects.Position;
import com.example.chessforandroid.R;

import java.util.ArrayList;

public class Queen extends AbstractPiece {

    public Queen(int color) {

        super(color);

        if (color == Color.WHITE){
            this.imageID = R.drawable.w_queen;
        } else {
                this.imageID = R.drawable.b_queen;
        }
    }

    @Override
    public ArrayList<Integer> getAloudMoves(Integer position, AbstractPiece[] board) {
        ArrayList<Integer> aloudMoves = new ArrayList<>();
        Position temp = ArrayDimensionConverter.pieceToTwoDimension(position);

        // STRAIGHT
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c, temp.r+i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c, temp.r-i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }

        // TODO: Gotta fix the way i do this
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r+i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                System.out.println("ELSE");
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c-i, temp.r-i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                System.out.println("ELSE");
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r-i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                System.out.println("ELSE");
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        for (int i = 1; i < 8; i++){
            int newPosition = ArrayDimensionConverter.pieceToOneDimension(temp.c+i, temp.r+i);
            if (newPosition != 100 && board[newPosition] == null) {
                aloudMoves.add(newPosition);
            }
            else {
                System.out.println("ELSE");
                if (newPosition < 64 && board[newPosition].color != board[position].color){
                    aloudMoves.add(newPosition);
                }
                i = 8;
            }
        }
        return aloudMoves;
    }

    @Override
    public String toString() {
        if (color == Color.BLACK){
            return "Black Queen";
        }else {
            return "White Queen";
        }
    }
}