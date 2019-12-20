package com.example.socketprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button send ;
    TextView receive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.ediText);
        send = findViewById(R.id.send);
        receive = findViewById(R.id.receive);

        /*Thread myThread = new Thread(new MyServerThread());
        myThread.start();*/
         send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Client msg = new Client();
                msg.execute(editText.getText().toString());
                Toast.makeText(MainActivity.this, "Sent!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
