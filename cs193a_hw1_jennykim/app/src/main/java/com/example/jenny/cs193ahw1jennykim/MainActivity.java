/*
 * Jenny Kim <yeonjaek@stanford.edu>
 * CS 193A, Winter 2017 (instructor: Prof. Marty Stepp)
 * Homework Assignment 1
 * Rock Paper Scissors - This app helps user play rock paper scissors.
 * When the user select either rock, paper, or scissors, the computer randomly also selects one.
 * The result would be updated accordingly - tie, win, or lose.
 * Note : The paper picture is actually a picture of my physics pset.
 * The image was downloaded from Google, and because of the copyright issue, I cannot publish the app.
 */

package com.example.jenny.cs193ahw1jennykim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Random;
import android.widget.TextView;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void userUpdatedRock(View view) {
        TextView one = (TextView) findViewById(R.id.tie);
        TextView two = (TextView) findViewById(R.id.win);
        TextView three = (TextView) findViewById(R.id.lost);
        ImageView four = (ImageView) findViewById(R.id.paperImg);
        ImageView five = (ImageView) findViewById(R.id.scissorsImg);
        ImageView six = (ImageView) findViewById(R.id.rockImg);
        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);
        three.setVisibility(View.INVISIBLE);
        four.setVisibility(View.INVISIBLE);
        five.setVisibility(View.INVISIBLE);
        six.setVisibility(View.INVISIBLE);

        Random rand = new Random();
        if (rand.nextInt() % 3 == 0) {
            TextView tie = (TextView) findViewById(R.id.tie);
            tie.setVisibility(View.VISIBLE);
            ImageView rockImg = (ImageView) findViewById(R.id.rockImg);
            rockImg.setVisibility(View.VISIBLE);
        } else if (rand.nextInt() % 3 == 1) {
            TextView win = (TextView) findViewById(R.id.win);
            win.setVisibility(View.VISIBLE);
            ImageView sImg = (ImageView) findViewById(R.id.scissorsImg);
            sImg.setVisibility(View.VISIBLE);
        } else {
            TextView lose = (TextView) findViewById(R.id.lost);
            lose.setVisibility(View.VISIBLE);
            ImageView pImg = (ImageView) findViewById(R.id.paperImg);
            pImg.setVisibility(View.VISIBLE);
        }
    }

    public void userUpdatedScissors(View view) {

        TextView one = (TextView) findViewById(R.id.tie);
        TextView two = (TextView) findViewById(R.id.win);
        TextView three = (TextView) findViewById(R.id.lost);
        ImageView four = (ImageView) findViewById(R.id.paperImg);
        ImageView five = (ImageView) findViewById(R.id.scissorsImg);
        ImageView six = (ImageView) findViewById(R.id.rockImg);
        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);
        three.setVisibility(View.INVISIBLE);
        four.setVisibility(View.INVISIBLE);
        five.setVisibility(View.INVISIBLE);
        six.setVisibility(View.INVISIBLE);

        Random rand = new Random();
        if (rand.nextInt() % 3 == 0) {
            TextView tie = (TextView) findViewById(R.id.tie);
            tie.setVisibility(View.VISIBLE);
            ImageView rockImg = (ImageView) findViewById(R.id.scissorsImg);
            rockImg.setVisibility(View.VISIBLE);
        } else if (rand.nextInt() % 3 == 1) {
            TextView win = (TextView) findViewById(R.id.win);
            win.setVisibility(View.VISIBLE);
            ImageView sImg = (ImageView) findViewById(R.id.paperImg);
            sImg.setVisibility(View.VISIBLE);
        } else {
            TextView lose = (TextView) findViewById(R.id.lost);
            lose.setVisibility(View.VISIBLE);
            ImageView pImg = (ImageView) findViewById(R.id.rockImg);
            pImg.setVisibility(View.VISIBLE);
        }
    }

    public void userUpdatedPaper(View view) {

        TextView one = (TextView) findViewById(R.id.tie);
        TextView two = (TextView) findViewById(R.id.win);
        TextView three = (TextView) findViewById(R.id.lost);
        ImageView four = (ImageView) findViewById(R.id.paperImg);
        ImageView five = (ImageView) findViewById(R.id.scissorsImg);
        ImageView six = (ImageView) findViewById(R.id.rockImg);
        one.setVisibility(View.INVISIBLE);
        two.setVisibility(View.INVISIBLE);
        three.setVisibility(View.INVISIBLE);
        four.setVisibility(View.INVISIBLE);
        five.setVisibility(View.INVISIBLE);
        six.setVisibility(View.INVISIBLE);

        Random rand = new Random();
        if (rand.nextInt() % 3 == 0) {
            TextView tie = (TextView) findViewById(R.id.tie);
            tie.setVisibility(View.VISIBLE);
            ImageView rockImg = (ImageView) findViewById(R.id.paperImg);
            rockImg.setVisibility(View.VISIBLE);
        } else if (rand.nextInt() % 3 == 1) {
            TextView win = (TextView) findViewById(R.id.win);
            win.setVisibility(View.VISIBLE);
            ImageView sImg = (ImageView) findViewById(R.id.rockImg);
            sImg.setVisibility(View.VISIBLE);
        } else {
            TextView lose = (TextView) findViewById(R.id.lost);
            lose.setVisibility(View.VISIBLE);
            ImageView pImg = (ImageView) findViewById(R.id.scissorsImg);
            pImg.setVisibility(View.VISIBLE);
        }
    }

    /*    //final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        RadioButton rock = (RadioButton) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                if(rand.nextInt()%3==0){
                    TextView tie = (TextView) findViewById(R.id.tie);
                    tie.setVisibility(View.VISIBLE);
                    ImageView rockImg = (ImageView) findViewById(R.id.rockImg);
                } else if(rand.nextInt()%3==1){
                    TextView win = (TextView) findViewById(R.id.win);
                    win.setVisibility(View.VISIBLE);
                    ImageView rockImg = (ImageView) findViewById(R.id.scissorsImg);
                } else{
                    TextView lose = (TextView) findViewById(R.id.lost);
                    lose.setVisibility(View.VISIBLE);
                    ImageView rockImg = (ImageView) findViewById(R.id.paperImg);
                }
            }
        });
        RadioButton paper = (RadioButton) findViewById(R.id.paper);
        RadioButton scissors = (RadioButton) findViewById(R.id.scissors);


        // if computerResult == radiogroup text then tie
            // break into cases */

}
