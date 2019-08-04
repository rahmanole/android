package com.example.materialdesing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class StandaloneToolbar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Contexual Menu");
        toolbar.setSubtitle("Superb");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String title = menuItem.getTitle().toString();
                switch (menuItem.getItemId()){
                    case R.id.settings:
                        Toast.makeText(StandaloneToolbar.this,title+" selected!",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.save:
                        Toast.makeText(StandaloneToolbar.this,title+" selected!",Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }
        });
    }
}
