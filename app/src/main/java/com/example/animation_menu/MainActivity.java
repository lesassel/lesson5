package com.example.animation_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView tv_animation;
    Animation clockWaseAnimation, slideUpAnimation, zoomInAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_animation = findViewById(R.id.tv_animation);
        clockWaseAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwase);
        slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
        zoomInAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.id.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.clockWise:
                tv_animation.startAnimation(clockWaseAnimation);
                break;
            case R.id.slideup:
                tv_animation.startAnimation(clockWaseAnimation);

                break;
            case R.id.zoom:
                tv_animation.startAnimation(zoomInAnimation);
                break;
        }
        }
        return true;
    }
}
