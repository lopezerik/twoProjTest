package com.example.erik.owheroinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowHero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hero);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView heroName = findViewById(R.id.hero_name);
        heroName.setText(name);
        TextView primary_val = findViewById(R.id.primary_value);
        primary_val.setText("9001");
    }
}
