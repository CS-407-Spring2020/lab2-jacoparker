package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleButtonClick(View v) {
        // Log.i("Info", "Button Pressed");

        EditText textField = (EditText) findViewById(R.id.enterNameEditText);
        // Toast.makeText(MainActivity.this, textField.getText().toString(), Toast.LENGTH_LONG).show();

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("message", textField.getText().toString());
        startActivity(i);
    }
}
