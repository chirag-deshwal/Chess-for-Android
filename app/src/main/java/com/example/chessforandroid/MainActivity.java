package com.example.chessforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.chessforandroid.Pieces.AbstractPiece;

public class MainActivity extends AppCompatActivity {

    GridView chessBoard;
    AbstractPiece[][] pieces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        //pieces = new AbstractPiece[8][8];
        pieces = Constants.newBoard;
        //
        chessBoard = findViewById(R.id.chessBoard);
        GridViewAdapter adapter = new GridViewAdapter(getApplicationContext(), pieces);
        chessBoard.setAdapter(adapter);
    }
}
