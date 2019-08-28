package com.example.chessforandroid;

import android.graphics.Color;

import com.example.chessforandroid.Pieces.AbstractPiece;
import com.example.chessforandroid.Pieces.Bishop;
import com.example.chessforandroid.Pieces.King;
import com.example.chessforandroid.Pieces.Knight;
import com.example.chessforandroid.Pieces.Pawn;
import com.example.chessforandroid.Pieces.Queen;
import com.example.chessforandroid.Pieces.Rook;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;

public class Constants {
    public static final int dark = Color.parseColor("#696969");
    public static final int light = Color.parseColor("#b0b0b0");

    public static final int w_pawn = R.drawable.w_pawn;
    public static final int w_queen = R.drawable.w_queen;
    public static final int w_king = R.drawable.w_king;
    public static final int w_knight = R.drawable.w_knight;
    public static final int w_bishop = R.drawable.w_bishop;
    public static final int w_rook = R.drawable.w_rook;
    public static final int b_pawn = R.drawable.b_pawn;
    public static final int b_queen = R.drawable.b_queen;
    public static final int b_king = R.drawable.b_king;
    public static final int b_knight = R.drawable.b_knight;
    public static final int b_bishop = R.drawable.b_bishop;
    public static final int b_rook = R.drawable.b_rook;

    public static final int newBoardColors[] = {
            light, dark, light, dark, light, dark, light, dark,
            dark, light, dark, light, dark, light, dark, light,
            light, dark, light, dark, light, dark, light, dark,
            dark, light, dark, light, dark, light, dark, light,
            light, dark, light, dark, light, dark, light, dark,
            dark, light, dark, light, dark, light, dark, light,
            light, dark, light, dark, light, dark, light, dark,
            dark, light, dark, light, dark, light, dark, light};

    public static final AbstractPiece[] newBoard = {
            new Rook(BLACK), new Knight(BLACK), new Bishop(BLACK), new Queen(BLACK), new King(BLACK), new Bishop(BLACK), new Knight(BLACK), new Rook(BLACK),
            new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
            null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null,
            new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
            new Rook(WHITE), new Knight(WHITE), new Bishop(WHITE), new Queen(WHITE), new King(WHITE), new Bishop(WHITE), new Knight(WHITE), new Rook(WHITE)
    };

}
