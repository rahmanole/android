package com.example.snackbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RippleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple);
    }

    public void goToSnackBar(View view){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }

    public void dummyClick(View view){
        //Codes to be here
    }
}
