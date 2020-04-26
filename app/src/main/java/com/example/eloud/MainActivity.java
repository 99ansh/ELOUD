package com.example.eloud;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button img=(Button)findViewById(R.id.img);
        Button qr =(Button)findViewById(R.id.qr);
        Button bar =(Button)findViewById(R.id.barcode);
        Button doc = (Button)findViewById(R.id.doc);
        Button txt =(Button)findViewById(R.id.txt);
        Button en=(Button)findViewById(R.id.english);
        Button ger=(Button)findViewById(R.id.german);
        Button ch=(Button)findViewById(R.id.chinese);
        Button fr=(Button)findViewById(R.id.french);
        Button image2 =(Button)findViewById(R.id.img2);

        val=0;

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cam2.class);
                intent.putExtra("language",val);
                startActivity(intent);
            }
        });

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cam3.class);
                intent.putExtra("language",val);
                startActivity(intent);
            }
        });

        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cam4.class);
                intent.putExtra("language",val);
                startActivity(intent);
            }
        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cam5.class);
                intent.putExtra("language",val);
                startActivity(intent);

            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "pressed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,cam6.class);
                intent.putExtra("language",val);
                startActivity(intent);
            }
        });

        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,cam7.class);
                intent.putExtra("language",val);
                startActivity(intent);
            }
        });
        en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=0;
                Toast.makeText(MainActivity.this, "English", Toast.LENGTH_SHORT).show();
            }
        });

        ger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=1;
                Toast.makeText(MainActivity.this, "German", Toast.LENGTH_SHORT).show();
            }

        });

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=2;
                Toast.makeText(MainActivity.this, "Chinese", Toast.LENGTH_SHORT).show();
            }
        });

        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=3;
                Toast.makeText(MainActivity.this, "French", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
