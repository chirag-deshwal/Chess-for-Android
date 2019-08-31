package com.example.chessforandroid.GameObjects;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chessforandroid.Pieces.King;
import com.example.chessforandroid.Pieces.Pawn;
import com.example.chessforandroid.Tools.Constants;
import com.example.chessforandroid.Activities.GridViewAdapter;
import com.example.chessforandroid.Pieces.AbstractPiece;

import java.util.ArrayList;

public class Match {

    private Context context;
    private GridView gridView;
    private GridViewAdapter adapter;
    private AbstractPiece[] board;
    private TextView textView;

    public Match(Context context, GridView gridView, TextView textView) {
        this.context = context;
        this.gridView = gridView;
        this.textView = textView;

        board = Constants.newBoard;
        adapter = new GridViewAdapter(context, board);
        gridView.setAdapter(adapter);
    }

    public void start(){

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            private boolean isFirstClick = true;
            private int clickedTile = 99;
            private AbstractPiece pieceOnTile = null;
            private int colorsTurn = Color.WHITE;
            ArrayList<Integer> aloudMoves = new ArrayList<>();

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Highlighting the tile on first click
                if (isFirstClick){

                    view.setBackgroundColor(Color.CYAN);
                    clickedTile = i;
                    pieceOnTile = board[i];
                    isFirstClick = !isFirstClick;

                    //TODO: Show available moves
                    try {
                        aloudMoves = board[i].getAloudMoves(i, board);
                        for (int b = 0; b < aloudMoves.size(); b++){
                            if (aloudMoves.get(b) != 100){
                                adapterView.getChildAt(aloudMoves.get(b)).setBackgroundColor(Color.CYAN);
                            }
                        }
                    } catch (Exception e){e.printStackTrace();}

                }

                // Move is registered
                else if (pieceOnTile != null && i != clickedTile && colorsTurn == pieceOnTile.color && aloudMoves.contains(i)) {

                    adapterView.getChildAt(clickedTile).setBackgroundColor(Constants.newBoardColors[clickedTile]);
                    if (board[i] != null && board[i].getClass() == King.class){

                        if (board[i].color == Color.WHITE && textView.getText() == ""){
                            textView.setText("BLACK WINS");
                        }
                        else if ( board[i].color == Color.BLACK && textView.getText() == "") {
                            textView.setText("WHITE WINS");
                        }
                    }

                    board[i] = pieceOnTile;
                    board[clickedTile] = null;
                    isFirstClick = true;
                    clickedTile = 99;
                    pieceOnTile = null;

                    if (colorsTurn == Color.WHITE){
                        colorsTurn = Color.BLACK;
                    }
                    else {
                        colorsTurn = Color.WHITE;
                    }

                    // Reverse board for turn switch
                    for(int a = 0; a < board.length / 2; a++)
                    {
                        AbstractPiece temp = board[a];
                        board[a] = board[board.length -a  - 1];
                        board[board.length - a - 1] = temp;
                    }

                    aloudMoves = null;
                    adapter.notifyDataSetChanged();
                    gridView.setAdapter(adapter);

                }

                else {

                    adapter.notifyDataSetChanged();
                    gridView.setAdapter(adapter);
                    isFirstClick = true;
                    clickedTile = 99;
                    pieceOnTile = null;
                }
            }
        });
    }
}
