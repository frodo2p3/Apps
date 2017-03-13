package com.brsvc.zaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button przycisk1, przycisk2, przycisk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przycisk1 = (Button) findViewById(R.id.button17);
        przycisk2 = (Button) findViewById(R.id.button18);
        przycisk3 = (Button) findViewById(R.id.button19);

        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Scena1.class);
                startActivity(i);
            }
        });
        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Scena2.class);
                startActivity(i);
            }
        });
        przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Scena3.class);
                startActivity(i);
            }
        });

    }
}
