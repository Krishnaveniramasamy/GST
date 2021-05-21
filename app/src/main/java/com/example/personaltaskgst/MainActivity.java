package com.example.personaltaskgst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_gst_amount,txt_total_amount;
    EditText txt_amount,txt_gst_percent;
    Button btn_calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_amount=findViewById(R.id.txt_amount);
        txt_gst_amount=findViewById(R.id.txt_gst_amount);
        txt_gst_percent=findViewById(R.id.txt_gst_percent);
        txt_total_amount=findViewById(R.id.txt_total_amount);
        btn_calculate=findViewById(R.id.btn_calculate);

        btn_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float total=Float.parseFloat(txt_amount.getText().toString());
                float gst_percent=Float.parseFloat(txt_gst_percent.getText().toString());
                float gst_amount= ( gst_percent / 100) * total;
                txt_gst_amount.setText("Gst Amount is:"+gst_amount);

                float total_amount = total + gst_amount;
                txt_total_amount.setText("The Net Total Amount" +total_amount);
            }
        });

    }
}