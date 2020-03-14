package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class funfactsactivity extends AppCompatActivity {
    private FactBook factBook= new FactBook();
    private ColorWheel colorWheel= new ColorWheel();

    private TextView factTextView;
    private Button showfactbutton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning varaibles

        factTextView =  (TextView) findViewById(R.id.factTextView);
        showfactbutton= (Button) findViewById(R.id.showfactbutton);
        relativeLayout= (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // whenever the button will be clicked, change the fact
                String fact= factBook.getFact();
                factTextView.setText(fact);

                int color= colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
            }
        };
        showfactbutton.setOnClickListener(listener);

    }
}
