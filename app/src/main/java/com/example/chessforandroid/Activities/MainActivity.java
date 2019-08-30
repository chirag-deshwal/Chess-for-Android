package com.example.chessforandroid.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.chessforandroid.Tools.Constants;
import com.example.chessforandroid.GameObjects.Match;
import com.example.chessforandroid.Pieces.AbstractPiece;
import com.example.chessforandroid.R;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    Button button_reset;
    TextView textView;
    Match match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button_reset = findViewById(R.id.button_reset);
        gridView = findViewById(R.id.chessBoard);
        gridView.setHorizontalSpacing(3);
        gridView.setVerticalSpacing(3);
        match = new Match(getApplicationContext(), gridView, textView);
        match.start();
        button_reset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 finish();
             }
         });
    }

}
