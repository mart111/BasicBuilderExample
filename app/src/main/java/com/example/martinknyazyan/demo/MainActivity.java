package com.example.martinknyazyan.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.felipecsl.gifimageview.library.GifImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start, stop;
    private GifImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.startBtn);
        stop = findViewById(R.id.stopBtn);
        gif = findViewById(R.id.gif);

        Person person =
                new Person.Builder()
                        .setName("Ashot")
                        .setSurname("Erkat")
                        .build();


        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }

}
