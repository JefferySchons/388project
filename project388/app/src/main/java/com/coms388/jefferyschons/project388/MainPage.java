package com.coms388.jefferyschons.project388;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Jeffery Schons on 11/28/2017.
 */

public class MainPage extends AppCompatActivity {
    private Button addButton;
    private Button viewButton;
    private EditText textAdd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

        addButton = (Button) findViewById(R.id.addButton);
        viewButton = (Button) findViewById(R.id.viewButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
