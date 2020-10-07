package edu.temple.colorchangingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    private RelativeLayout rootLayout;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas2);

        rootLayout = findViewById(R.id.canvas_color_root);
        textView = findViewById(R.id.canvas_color_text);


     /*   Intent intent = getIntent();
        int backgroundColor = intent.getIntExtra("colorCode",0);
        String colorName = intent.getStringExtra("colorName");

        rootLayout.setBackgroundColor(getResources().getColor(backgroundColor));
        textView.setText(colorName); */
    }
}
