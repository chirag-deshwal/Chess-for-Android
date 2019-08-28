package com.example.chessforandroid;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.chessforandroid.Pieces.AbstractPiece;

public class Match {

    private Context context;
    private GridView gridView;
    GridViewAdapter adapter;
    private AbstractPiece[] board;

    public Match(Context context, GridView gridView) {
        this.context = context;
        this.gridView = gridView;
    }

    public void start(){

        board = Constants.newBoard;
        adapter = new GridViewAdapter(context, board);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            private boolean isFirstClick = true;
            private int clickedTile = 100;
            private AbstractPiece pieceOnTile = null;
            private int colorsTurn = Color.WHITE;

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Highlighting the tile on first click
                if (isFirstClick){
                    view.setBackgroundColor(Color.CYAN);
                    clickedTile = i;
                    pieceOnTile = board[i];
                    isFirstClick = !isFirstClick;

                    //TODO: Show available moves
                }

                // Move is registered
                else if (pieceOnTile != null && i != clickedTile && colorsTurn == pieceOnTile.color) {
                    adapterView.getChildAt(clickedTile).setBackgroundColor(Constants.newBoardColors[clickedTile]);
                    board[i] = pieceOnTile;
                    board[clickedTile] = null;
                    isFirstClick = true;
                    clickedTile = 100;
                    pieceOnTile = null;

                    if (colorsTurn == Color.WHITE){
                        colorsTurn = Color.BLACK;
                    } else {
                        colorsTurn = Color.WHITE;
                    }

                    // Reverse board for turn switch

                    for(int a = 0; a < board.length / 2; a++) {
                        AbstractPiece temp = board[a];
                        board[a] = board[board.length -a  - 1];
                        board[board.length - a - 1] = temp;
                    }

                    adapter.notifyDataSetChanged();
                    gridView.setAdapter(adapter);

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
