package com.example.snackbardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToSnackBar(View view){
        Intent intent = new Intent(this,Home.class);
        startActivity(intent);
    }

    public void goToRippleActivity(View view){
        Intent intent = new Intent(this,RippleActivity.class);
        startActivity(intent);
    }

    public void goToListView(View view){
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }
}
