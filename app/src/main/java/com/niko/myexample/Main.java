package com.niko.myexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity implements View.OnClickListener {

    TextView txtView1;
    TextView txtView2;
    Button btnTxtView1;
    Button btnTxtView2;
    boolean isActive1 = false;
    boolean isActive2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView1 = findViewById(R.id.txtView1);
        txtView2 = findViewById(R.id.txtView2);
        btnTxtView1 = findViewById(R.id.btnTextView1);
        btnTxtView2 = findViewById(R.id.btnTextView2);
        btnTxtView1.setOnClickListener(this);
        btnTxtView2.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTextView1:
                if (isActive1) {
                    txtView1.setText("TV1 is active");
                    isActive1 = false;
                } else {
                    txtView1.setText("TV1 is inactive");
                    isActive1 = true;
                }
                break;
            case R.id.btnTextView2:
                txtView2.setText("TV2 active");
                if (isActive1) {
                    txtView2.setText("TV2 is active");
                    isActive2 = false;
                } else {
                    txtView2.setText("TV2 is inactive");
                    isActive2 = true;
                }
                break;
        }
    }
}
