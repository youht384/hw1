package com.example.m927;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button load;
    boolean ClickTime = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load = (Button) findViewById(R.id.load_in);


    }

    public void buttonClick(View view) {
        Toast toast = Toast.makeText(this, R.string.ButtonOnClickMessage, Toast.LENGTH_SHORT);
        toast.show();
        if(ClickTime==true) {
            load.setText(R.string.logoutMessage);
            ClickTime=false;
        }
        else {
            load.setText(R.string.buttonText);
            ClickTime=true;
        }
    }
}
