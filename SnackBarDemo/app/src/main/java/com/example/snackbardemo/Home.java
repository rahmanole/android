package com.example.snackbardemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        rootLayout = findViewById(R.id.rootLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this,"Fab is clicked",Toast.LENGTH_LONG).show();
            }
        });

        toolbar.setTitle("Snack Bar");
        toolbar.setSubtitle("sub title");
        toolbar.inflateMenu(R.menu.main_menu);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String title =menuItem.getTitle().toString();
                switch (menuItem.getItemId()){
                    case R.id.simple:
                        showSimpleSnackbar();
                        break;
                    case R.id.withAction:
                        showSnackbarWithAction();
                        break;
                }
                return false;
            }
        });


    }

    public void showSimpleSnackbar(){
        Snackbar.make(rootLayout,"Simple snack bar",Snackbar.LENGTH_LONG).show();
    }

    public void showSnackbarWithAction(){
        Snackbar snackbar = Snackbar.make(rootLayout,"File deleted successfully",Snackbar.LENGTH_LONG);
        snackbar.setAction("UNDO",new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Snackbar.make(rootLayout,"File recovered successfully",Snackbar.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }

    public void goToRippleEffects(View view){
        Intent intent = new Intent(this,RippleActivity.class);
        startActivity(intent);
    }
}
