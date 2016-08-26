package com.example.nesjen.nesj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton actionButton = (ImageButton) findViewById(R.id.imageButton);
        actionButton.setOnClickListener(new View.OnClickListener()
        {
            //Test
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "hello world!", Toast.LENGTH_LONG).show();


            }
        });

    }
}
