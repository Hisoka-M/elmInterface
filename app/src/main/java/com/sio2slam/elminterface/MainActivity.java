package com.sio2slam.elminterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);
    }
    public void DisplayTextView(View view){
        TextView textView = new TextView(this);
        // définition du textview
        textView.setText("test d'insertion");
        // intégration dans le layout
        ll.addView(textView);
    }
    public void DisplayEditText(View view){
        EditText editText = new EditText(this);
        editText.setText("write here");
        ll.addView(editText);
    }
    public void DisplayNewButton(View view){
        Button btn = new Button(this);
        btn.setText("new button");
        ll.addView(btn);
    }
    public void DisplayNewImage(View view){
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.hisoka_smile);
        ll.addView(imageView);
    }
}
