package com.example.chessforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.example.chessforandroid.Pieces.AbstractPiece;
import com.example.chessforandroid.Pieces.Pawn;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    AbstractPiece[] board;
    Button button_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        board = Constants.newBoard;
        button_reset = findViewById(R.id.button_reset);
        gridView = findViewById(R.id.chessBoard);
        gridView.setHorizontalSpacing(3);
        gridView.setVerticalSpacing(3);
        Match match = new Match(getApplicationContext(), gridView);
        match.start();

    }
}
