package com.example.snackbardemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    LinearLayout rootLayoutOfListView;
    String[] listImtens = {"Minhaz","Shuvo","Rony","Rahmant","Yasin","Showkat"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listImtens);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);

        rootLayoutOfListView = findViewById(R.id.rootLayoutOfListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select an Item");
        menu.add(0, Menu.FIRST,Menu.NONE,"Call");
        menu.add(1, Menu.FIRST,Menu.NONE,"SMS");
        menu.add(2, Menu.FIRST,Menu.NONE,"Block");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle() == "Call"){
            Toast.makeText(this,"Calling",Toast.LENGTH_SHORT).show();
        }

        if(item.getTitle() == "SMS"){
            Toast.makeText(this,"SMS",Toast.LENGTH_SHORT).show();
        }
        if(item.getTitle() == "Block"){
            //Toast.makeText(this,"Blocked",Toast.LENGTH_SHORT).show();
            Snackbar snackbar = Snackbar.make(rootLayoutOfListView,"Contact Blocked Successfully",Snackbar.LENGTH_SHORT);
//            snackbar.setAction("UNDO",(v)->{
//
//            });
            snackbar.show();
        }

        return true;
    }
}
