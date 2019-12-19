package com.jurrutia.android.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioGroup;

public class CreateUserActivity extends AppCompatActivity {
    boolean male = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);



// more code

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.male:
                        male = true;
                        break;
                    case R.id.female:
                        male = false;
                        break;
                }
            }
        });
    }

    // imports for information

// as before

    public void onClick(View view) {
        EditText input = (EditText) findViewById(R.id.username);
        String string = input.getText().toString();
        if(male == true)
            Toast.makeText(this, "User " + string + " created. Gender: Male", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "User " + string + " created. Gender: Female", Toast.LENGTH_LONG).show();

    }
}
