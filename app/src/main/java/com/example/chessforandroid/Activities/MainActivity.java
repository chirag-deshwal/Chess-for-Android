package com.example.chessforandroid.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

import com.example.chessforandroid.Tools.Constants;
import com.example.chessforandroid.GameObjects.Match;
import com.example.chessforandroid.Pieces.AbstractPiece;
import com.example.chessforandroid.R;

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
