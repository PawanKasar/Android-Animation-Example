package com.example.pawans.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView elephant;
    double currpos = 0 , prevpos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elephant = (ImageView)findViewById(R.id.imageView);
        elephant.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                float xc = elephant.getWidth() / 2;
                float yc = elephant.getHeight() / 2;

                float x = event.getX();
                float y = event.getY();

                switch (event.getAction()){

                    case MotionEvent.ACTION_DOWN:{
                        elephant.clearAnimation();

                        currpos = Math.toDegrees(Math.atan2(x - yc,y - xc));
                        break;
                    }
                    case MotionEvent.ACTION_MOVE:{
                        prevpos = currpos;
                        currpos = Math.toDegrees(Math.atan2(x - xc,y - yc));
                        animate(prevpos,currpos,0);
                        System.out.println(currpos);
                        break;
                    }
                    case MotionEvent.ACTION_UP:{
                        prevpos = currpos = 0;
                        break;
                    }

                }

                return true;
            }
        });

    }


    private void animate(double fromDegrees, double toDegrees, long durationMillis) {
        final RotateAnimation rotate = new RotateAnimation((float) fromDegrees, (float) toDegrees,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(durationMillis);
        rotate.setFillEnabled(true);
        rotate.setFillAfter(true);
        elephant.startAnimation(rotate);
        System.out.println(currpos);
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