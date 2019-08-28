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

        //
        //board = new AbstractPiece[8][8];
        board = Constants.newBoard;
        //
        gridView = findViewById(R.id.chessBoard);
        final GridViewAdapter adapter = new GridViewAdapter(getApplicationContext(), board);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            private boolean isFirstClick = true;
            private int clickedTile = 100;
            private AbstractPiece pieceOnTile = null;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Highlighting the tile on first click
                if (isFirstClick){
                    view.setBackgroundColor(Color.CYAN);
                    clickedTile = i;
                    pieceOnTile = board[i];
                    isFirstClick = !isFirstClick;
                }

                // Move is registered
                else if (pieceOnTile != null && i != clickedTile) {
                    adapterView.getChildAt(clickedTile).setBackgroundColor(Constants.newBoardColors[clickedTile]);
                    board[i] = pieceOnTile;
                    board[clickedTile] = null;
                    isFirstClick = true;
                    adapter.notifyDataSetChanged();
                    gridView.setAdapter(adapter);
                    clickedTile = 100;
                    pieceOnTile = null;
                }
                else {
                    adapter.notifyDataSetChanged();
                    gridView.setAdapter(adapter);
                    isFirstClick = true;
                    clickedTile = 100;
                    pieceOnTile = null;
                }

                
            }
        });
    }
}
