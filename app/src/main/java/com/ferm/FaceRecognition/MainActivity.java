package com.ferm.FaceRecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private MaterialButton button;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

        button = (MaterialButton)findViewById(R.id.sign_in_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(true) {
                    startActivity(new Intent(MainActivity.this, FaceCapture.class));
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                    finishActivity(0);
                }
            }
            });

    }

    public void writeNewKid(String collection, String kidId, String voornaam, String naam) {
        Kid kid = new Kid(voornaam, naam);

        Log.v(TAG, "Adding a kid to database");
        mDatabase.child(collection).child(kidId).setValue(kid);
    }
}
