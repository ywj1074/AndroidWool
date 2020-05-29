package com.app.androidwool.activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidwool.R;

public class RoundImageView extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_image_view);
        imageView = findViewById(R.id.riv_rounded_image_view);
        /**loadimg();*/
    }


    /**
    public void loadimg() {
        Transformation transformation = new RoundedTransformationBuilder()
                .borderColor(Color.BLACK)
                .borderWidthDp(3)
                .cornerRadiusDp(30)
                .oval(false)
                .build();

        Picasso.with(RoundImageView.this).load("https://admin.cashboxes.in/cc8a71fea073/cashboxadmin/2020-05-26/FGFR007GF3MJLQC9C7KF.png")
                .fit()
                .transform(transformation)
                .into(imageView);
    }

*/

}
