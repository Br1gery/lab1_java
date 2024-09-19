package com.example.lab1_java;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void hideName(View view) {

        TextView text1 = findViewById(R.id.textView);
        TextView text2 = findViewById(R.id.textView3);

        if(text1.getVisibility() == View.INVISIBLE){

            text1.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);

        }
        else {

            text1.setVisibility(View.INVISIBLE);
            text2.setVisibility(View.INVISIBLE);

        }

    }

    public void hideImg(View view) {

        ImageView img1 = findViewById(R.id.imageView);

        if(img1.getVisibility() == View.INVISIBLE){

            img1.setVisibility(View.VISIBLE);

        }
        else {

            img1.setVisibility(View.INVISIBLE);

        }

    }
}