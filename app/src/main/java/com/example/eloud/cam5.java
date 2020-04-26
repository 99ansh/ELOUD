package com.example.eloud;

import android.speech.tts.TextToSpeech;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class cam5 extends AppCompatActivity {

    TextToSpeech textToSpeech;
    Button start;
    Button stop;
    EditText editText;
    int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam5);
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        start = (Button)findViewById(R.id.btn_takepicture);
        stop =(Button)findViewById(R.id.stp_button);
        editText =(EditText)findViewById(R.id.editText);
        Toast.makeText(this, String.valueOf(val), Toast.LENGTH_SHORT).show();
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener(){
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR){
                    if(val==1) {
                        textToSpeech.setLanguage(Locale.GERMAN);
                    }
                    else if(val==2){
                        textToSpeech.setLanguage(Locale.CHINESE);
                    }
                    else if(val==3){
                        textToSpeech.setLanguage(Locale.FRENCH);
                    }
                    else {
                        textToSpeech.setLanguage(Locale.ENGLISH);
                    }
                }
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(editText.getText());
                textToSpeech.speak(text,TextToSpeech.QUEUE_ADD,null);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.stop();
            }
        });
    }
}
