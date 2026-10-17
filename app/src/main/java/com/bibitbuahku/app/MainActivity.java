package com.bibitbuahku.app;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("BibitBuahku Ready!");
        tv.setTextSize(24);
        tv.setPadding(50,200,50,50);
        setContentView(tv);
    }
}
