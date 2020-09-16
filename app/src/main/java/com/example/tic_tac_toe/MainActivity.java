package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int active=0;
    int[] gamestate={2,2,2,2,2,2,2,2,2};
    int[][] winningpos={{0,1,2},{3,4,5},{6,7,8},
                        {0,3,6},{1,4,7},{2,5,8},
                        {0,4,8},{2,4,6}};
    /*Here,0-->x (user)
         1-->o(system)
        gamestate==2(means the image view currently empty)*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

    }
    public void playerTap (View view){
        ImageView img = (ImageView) view;
        int tappedImage = Integer.parseInt(img.getTag().toString());
        if(gamestate[tappedImage]==2){
            gamestate[tappedImage]=active;
            img.setTranslationY(-1000f);
            if(active==0){
                img.setImageResource(R.drawable.x);
                active=1;
            }
            else{
                img.setImageResource(R.drawable.o);
                active=0;
            }
            img.animate().translationYBy(1000f).setDuration(200);
        }


    }
}