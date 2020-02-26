package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int Count = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.show_text);

    }
    public void Toast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_alert,
                Toast.LENGTH_SHORT);
        toast.show();
    }



    public void CountAdd(View view) {
        Count++;
        if (textView != null)
            textView.setText(Integer.toString(Count));
    }
}

