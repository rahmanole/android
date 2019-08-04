package com.example.materialdesing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextualMenu extends AppCompatActivity {
    ActionMode actionMode;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contexual_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Material");
        toolbar.setSubtitle("Superb");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        button = findViewById(R.id.ctxBtn);

        toolbar.inflateMenu(R.menu.main_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String title = menuItem.getTitle().toString();
                switch (menuItem.getItemId()){
                    case R.id.settings:
                        Toast.makeText(ContextualMenu.this,title+" selected!",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.save:
                        Toast.makeText(ContextualMenu.this,title+" selected!",Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionMode = ContextualMenu.this.startActionMode(new ContexualCallBack());
            }
        });


    }

    class ContexualCallBack implements ActionMode.Callback{

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.contexual_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("My ActionMode");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem item) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    }
}
