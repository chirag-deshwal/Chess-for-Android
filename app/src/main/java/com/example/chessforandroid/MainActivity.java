package com.example.chessforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.chessforandroid.Pieces.AbstractPiece;
import com.example.chessforandroid.Pieces.Pawn;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    AbstractPiece[] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = Constants.newBoard;

        gridView = findViewById(R.id.chessBoard);
        GridViewAdapter adapter = new GridViewAdapter(getApplicationContext(), board);
        gridView.setAdapter(adapter);

        Match match = new Match(getApplicationContext(), gridView);
        match.start();


    }
}
