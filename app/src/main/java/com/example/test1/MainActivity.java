package com.example.test1;

import android.app.ListActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends ListActivity {
    final String[] cat = new String[] {"123", "456", "789"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, cat);
        setListAdapter(adapter);
        OnItemClickListener itemListener = new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position,
                                    long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, T1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new
                                Intent(MainActivity.this, T2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new
                                Intent(MainActivity.this, T3.class);
                        startActivity(intent2);
                        break;
                }
                Toast.makeText(getApplicationContext(), "Вы выбрали " +
                                parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(itemListener);
    }
}
