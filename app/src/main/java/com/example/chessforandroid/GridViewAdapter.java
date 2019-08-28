package com.example.chessforandroid;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.chessforandroid.Pieces.AbstractPiece;

public class GridViewAdapter extends BaseAdapter {

    private AbstractPiece[][] board;
    private AbstractPiece[] boardToOneDArray;
    private Context context;
    private LayoutInflater layoutInflater;

    public GridViewAdapter(Context context, AbstractPiece[][] board) {
        this.board = board;
        this.context = context;
        this.layoutInflater = (LayoutInflater.from(context));
        this.boardToOneDArray = arrayTransformer();
    }

    @Override
    public int getCount() {
        int length = 0;
        for (int i = 0; i < board.length; i++){
            length += board[i].length;
        }
        return length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.tile_layout, null);
        SquareImageView imageView = view.findViewById(R.id.piece_image);

        // Set tile background colors
        view.setBackgroundColor(Constants.newBoardColors[i]);
        if (boardToOneDArray[i] != null){
            imageView.setImageResource(boardToOneDArray[i].imageID);
        }
        return view;
    }

    private AbstractPiece[] arrayTransformer(){
        AbstractPiece[] temp = new AbstractPiece[64];
        int tempIndex = 0;
        for (int c = 0; c < board.length; c++){
            for (int r = 0; r < board[c].length; r++){
                temp[tempIndex] = board[c][r];
                tempIndex +=1;
            }
        }
        return temp;
    }


}
