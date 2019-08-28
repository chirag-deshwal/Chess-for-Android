package com.example.chessforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.chessforandroid.Pieces.AbstractPiece;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    AbstractPiece[][] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        //board = new AbstractPiece[8][8];
        board = Constants.newBoard;
        //
        gridView = findViewById(R.id.chessBoard);
        GridViewAdapter adapter = new GridViewAdapter(getApplicationContext(), board);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Position position = Position.oneDtoTwoD(i);
                board[position.column][position.row].getAloudMoves(position, board);
                view.setBackgroundColor(Color.CYAN);
            }
        });
    }
}
