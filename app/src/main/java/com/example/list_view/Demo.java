package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Demo extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        textView=findViewById(R.id.textview);

        String TempHolder = getIntent().getStringExtra("ListViewClickedValue");

        // Setting up received value into EditText.
        textView.setText(TempHolder);


    }
}
