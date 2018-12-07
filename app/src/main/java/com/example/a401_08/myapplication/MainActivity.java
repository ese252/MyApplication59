package com.example.a401_08.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
               //startActivity(intent1);

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Name","Samira");
                startActivityForResult(intent,150);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==150)
        {
            if(resultCode==Activity.RESULT_OK)
            {
                Toast.makeText(this,data.getStringExtra("name"),Toast.LENGTH_LONG).show();
            }
        }
    }
}
