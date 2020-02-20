package com.ferm.FaceRecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FaceCapture extends AppCompatActivity {


    private MaterialButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_capture);

        button = (MaterialButton)findViewById(R.id.scan_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Algorithme om te checken of de persoon al in de database staat
                if(true) {
                    startActivity(new Intent(FaceCapture.this, RegistrationForm.class));
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT):
                    toast.setMargin(50,50);
                    toast.show();
                    finishActivity(0);
                }
                }
        });
    }
}
