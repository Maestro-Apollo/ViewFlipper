package com.example.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.view_flipper);
        viewFlipper.setFlipInterval(1000);
        viewFlipper.startFlipping();

        TextView textView = new TextView(this);
        textView.setText("This is dynamic!");
        textView.setGravity(Gravity.CENTER);
        viewFlipper.addView(textView);
    }

    public void PreviousBtn(View view) {
        viewFlipper.showPrevious();
    }

    public void NextBtn(View view) {
        viewFlipper.showNext();
    }
}
