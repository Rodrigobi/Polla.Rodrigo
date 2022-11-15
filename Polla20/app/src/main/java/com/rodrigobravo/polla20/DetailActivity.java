package com.rodrigobravo.polla20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ImageView imageView = findViewById(R.id.poster_image);
        TextView code_tv = findViewById(R.id.mRating);
        TextView team_tv = findViewById(R.id.mTitle);
        TextView iniciales_tv = findViewById(R.id.movervie_tv);

        Bundle bundle = getIntent().getExtras();

        String mName = bundle.getString("Name");
        String mCrest = bundle.getString("crest");
        String mCode = bundle.getString("code");

        Glide.with(this).load(mCrest).into(imageView);
        team_tv.setText(mName);
        code_tv.setText(mCode);

    }
}