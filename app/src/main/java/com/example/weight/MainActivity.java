package com.example.weight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar rat_bar;
        final TextView txt_rat;

        rat_bar=findViewById(R.id.rat_bar);
        txt_rat = findViewById(R.id.txt_rat);

        rat_bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txt_rat.setText("your Rating :" +rating);
            }
        });
    }
}
