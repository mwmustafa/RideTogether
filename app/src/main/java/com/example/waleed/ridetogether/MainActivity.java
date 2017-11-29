package com.example.waleed.ridetogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button EU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EU=(Button)findViewById(R.id.ExistingUsers);
        EU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next_page(v);
            }
        });
    }
    public void next_page(View v){
        Intent intent= new Intent(this, ExistingUsers.class);
        startActivity(intent);
    }
}
