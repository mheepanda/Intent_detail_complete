package sdu.cs58.pichsinee.trafficesignapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explicit
    TextView titleTextView, detailTextView;
    ImageView signImageView;
    Button backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //intial View ผูกตัวแปรบนจาวา กับ xml
        titleTextView = findViewById(R.id.txvTitle);
        detailTextView = findViewById(R.id.txvDetail);
        signImageView = findViewById(R.id.imvSign);


        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML

        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("image",R.drawable.traffic_01));




    }//end onCreate Method

}//end Class
