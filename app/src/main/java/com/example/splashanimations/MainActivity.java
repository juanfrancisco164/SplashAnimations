package com.example.splashanimations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView2Left = findViewById(R.id.ImageView2_Left);
        ImageView imageView2Right = findViewById(R.id.ImageView2_Right);
        ImageView imageView3Left = findViewById(R.id.ImageView3_Left);
        ImageView imageView3Right = findViewById(R.id.ImageView3_Right);
        TableLayout tableLayout = findViewById(R.id.TableLayout01);

        TextView textViewTopTitle = findViewById(R.id.TextViewTopTitle);
        TextView textViewBottomTitle = findViewById(R.id.TextViewBottomTitle);

        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.custom_anim);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        imageView2Left.startAnimation(rotateAnimation);
        imageView2Right.startAnimation(rotateAnimation);
        imageView3Left.startAnimation(rotateAnimation);
        imageView3Right.startAnimation(rotateAnimation);
        tableLayout.startAnimation(rotateAnimation);

        textViewTopTitle.startAnimation(fadeInAnimation);
        textViewBottomTitle.startAnimation(fadeInAnimation);
    }
}
