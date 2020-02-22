package com.femidof.momentum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView question = (TextView) findViewById(R.id.flashcard_question);
       question.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               Log.i("Button","Hello");
               findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
               findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
           }
       });

        TextView answer = (TextView) findViewById(R.id.flashcard_answer);
       answer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button","Hello");
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
            }
        });

        TextView answer1 = (TextView) findViewById(R.id.answer1);
        answer1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer1).setBackgroundColor(Color.RED);
//                findViewById(R.id.answer2).setBackgroundColor(Color.RED);
                findViewById(R.id.answer3).setBackgroundColor(Color.GREEN);
            }
        });
        TextView answer2 = (TextView) findViewById(R.id.answer2);
        answer2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                findViewById(R.id.answer1).setBackgroundColor(Color.RED);
                findViewById(R.id.answer2).setBackgroundColor(Color.RED);
                findViewById(R.id.answer3).setBackgroundColor(Color.GREEN);
            }
        });

        TextView answer3 = (TextView) findViewById(R.id.answer3);
        answer3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                findViewById(R.id.answer1).setBackgroundColor(Color.RED);
//                findViewById(R.id.answer2).setBackgroundColor(Color.RED);
                findViewById(R.id.answer3).setBackgroundColor(Color.GREEN);
            }
        });
//int color = FF838B8B;
//        TextView reset = (TextView) findViewById(R.id.reset);
//        reset.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
////
//                findViewById(R.id.answer3).setBackgroundColor(Color.GRAY);
//                findViewById(R.id.answer2).setBackgroundColor(Color.GRAY);
//                findViewById(R.id.answer1).setBackgroundColor(Color.GRAY);
//            }
//        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new OnClickListener() {
            boolean visible = true;
            @Override
            public void onClick(View v) {
                if (visible)
                {

                    ImageView img1 =  findViewById(R.id.toggle_choices_visibility);
                    img1.setImageResource(R.drawable.ic_visibility_off_black_24dp);
//
                    findViewById(R.id.answer3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer1).setVisibility(View.INVISIBLE);
                    visible = false;
                }
                else
                {
                    ImageView img1 =  findViewById(R.id.toggle_choices_visibility);
                    img1.setImageResource(R.drawable.ic_remove_red_eye_black_24dp);
                    findViewById(R.id.answer3).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer2).setVisibility(View.VISIBLE);
                    findViewById(R.id.answer1).setVisibility(View.VISIBLE);
                    visible = true;
                }

            }
        });
        findViewById(R.id.rootView).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer3).setBackgroundColor(Color.GRAY);
                findViewById(R.id.answer2).setBackgroundColor(Color.GRAY);
                findViewById(R.id.answer1).setBackgroundColor(Color.GRAY);
            }
        });


    }
}
