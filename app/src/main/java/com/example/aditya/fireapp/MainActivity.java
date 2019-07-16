package com.example.aditya.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button;
    Firebase fire;
    EditText editText;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting context ..will be different in complex cases.
        //We finally made a different class for this and to use that in every page we mentioned it in androidManifest
        //Firebase.setAndroidContext(this);

        fire = new Firebase("https://fireapp-f0177.firebaseio.com/Users");

        editText2 = (EditText)findViewById(R.id.editText2);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = editText.getText().toString();
                String key = editText2.getText().toString();

                Firebase child = fire.child(key);
                child.setValue(value);


                //PUSH ADDS A VALUE WITH A UNIQUE KEY.
                //child.push().setValue(name);;


            }
        });

    }
}
