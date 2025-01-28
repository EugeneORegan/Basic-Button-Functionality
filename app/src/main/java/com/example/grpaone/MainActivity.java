package com.example.grpaone;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Button one = findViewById(R.id.buttonOn); // Assigning the button to a Java object
            /*
            Use of a ClickListener (an event listener).
            This will wait in the background until clicked.
            This example displays a simple Toast but could do other actions if needed.
             */
            one.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    CharSequence text = "Tea and Toast!!!!!!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(getApplication(), text, duration);
                    toast.show();                }
            });
            return insets;
        });
    }
}