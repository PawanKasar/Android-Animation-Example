package com.example.pawans.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clockwise(View view){

        ImageView imageview = (ImageView)findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
        imageview.startAnimation(animation);

    }
    public void zoom(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Animation animationzoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        imageView.startAnimation(animationzoom);

    }
    public void fade(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Animation animationfade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        imageView.startAnimation(animationfade);

    }
    public void blink(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Animation animationblink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        imageView.startAnimation(animationblink);

    }
    public void move(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Animation animationmove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imageView.startAnimation(animationmove);

    }
    public void slide(View view){

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Animation animationslide = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        imageView.startAnimation(animationslide);

    }


}