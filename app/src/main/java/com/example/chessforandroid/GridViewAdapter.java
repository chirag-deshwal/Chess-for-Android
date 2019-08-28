package com.example.chessforandroid;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.chessforandroid.Pieces.AbstractPiece;

public class GridViewAdapter extends BaseAdapter {

    private AbstractPiece[] board;
    private Context context;
    private LayoutInflater layoutInflater;

    public GridViewAdapter(Context context, AbstractPiece[] board) {
        this.board = board;
        this.context = context;
        this.layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return board.length;
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
        if (board[i] != null){
            imageView.setImageResource(board[i].imageID);
        }
        return view;
    }
}
