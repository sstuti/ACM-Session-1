package com.example.session1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView heading;
    private EditText name;
    private Button button;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heading = findViewById(R.id.heading);
        name = findViewById(R.id.name);
        button = findViewById(R.id.button);
        image = findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for signing up!", Toast.LENGTH_LONG).show();
                heading.setText("Hello!");
            }
        });

    }
}