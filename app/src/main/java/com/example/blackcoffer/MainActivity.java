package com.example.blackcoffer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void card1(View view) {

        Toast.makeText(this, "Profile 1", Toast.LENGTH_SHORT).show();

        final ImageView imageView = (ImageView) findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.flip1);
                set.setTarget(imageView);
                set.start();
            }
        });
    }

    public void card2(View view) {

        Toast.makeText(this, "Profile 2", Toast.LENGTH_SHORT).show();

        final ImageView imageView = (ImageView) findViewById(R.id.img1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.flip1);
                set.setTarget(imageView);
                set.start();
            }
        });
    }

    public void card3(View view) {
        Toast.makeText(this, "Profile 3", Toast.LENGTH_SHORT).show();

        final ImageView imageView = (ImageView) findViewById(R.id.img2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.flip1);
                set.setTarget(imageView);
                set.start();
            }
        });
    }

    public void card4(View view) {
        Toast.makeText(this, "Profile 4", Toast.LENGTH_SHORT).show();

        final ImageView imageView = (ImageView) findViewById(R.id.img3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.flip1);
                set.setTarget(imageView);
                set.start();
            }
        });
    }

    public void card5(View view) {
        Toast.makeText(this, "Profile 5", Toast.LENGTH_SHORT).show();

        final ImageView imageView = (ImageView) findViewById(R.id.img4);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this, R.animator.flip1);
                set.setTarget(imageView);
                set.start();
            }
        });
    }
        public void refinebtn(View view){
            Intent intent = new Intent(this, RefineActivity.class);
            startActivity(intent);

        }
        public void ringbtn(View view){
            Toast.makeText(this, "Notification Button", Toast.LENGTH_SHORT).show();
        }
}