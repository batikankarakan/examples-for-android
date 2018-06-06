package com.example.batikan.layoutsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayoutExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int exampleId = getIntent().getIntExtra("exampleId", 0);

        switch (exampleId) {
            case LinearLayoutActivity.HORIZANTAL_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_horizontal);
                break;
            case LinearLayoutActivity.VERTICAL_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_vertical);
                break;
            case LinearLayoutActivity.WEIGHT_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_weight);
                break;
            case LinearLayoutActivity.GRAVITY_EXAMPLE:
                setContentView(R.layout.activity_linear_layout_gravity);
                break;

            default:
                break;
        }
    }
}
