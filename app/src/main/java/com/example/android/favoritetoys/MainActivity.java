package com.example.android.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*Declare TextView variable*/
    TextView  mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Use findViewById to get a reference to the TextView from the layout*/
        mToysListTextView = findViewById(R.id.tv_toys_names);
        /*Use the static ToyBox.getToyNames method and store the names in a String array*/
        String[] toyNames = ToyBox.getToyNames();
        /* Loop through each toy and append the name to the TextView (add \n for spacing)*/
        for (String toyName : toyNames) {
            mToysListTextView.append(toyName + "\n\n\n");

        }
    }
}