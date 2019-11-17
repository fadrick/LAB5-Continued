package com.example.recyclerviewandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    RecyclerView recyclerView;
    private ArrayList<Integer> images=new ArrayList<>();
    private ArrayList<String> match=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        images.add(R.drawable.lightbulb);
        match.add("IESCO");

        images.add(R.drawable.lightbulb);
        match.add("LESCO");

        images.add(R.drawable.lightbulb);
        match.add("MEPCO");

        images.add(R.drawable.lightbulb);
        match.add("PESCO");
        images.add(R.drawable.lightbulb);
        match.add("GEPCO");

        images.add(R.drawable.lightbulb);
        match.add("K-Electric");
        images.add(R.drawable.lightbulb);
        match.add("HESCO");

        images.add(R.drawable.lightbulb);
        match.add("SEPCO");

        recyclerView=(RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Adapter adapter=new Adapter(this,images,match);
        recyclerView.setAdapter(adapter);


        navigationView=(NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item.getItemId()==R.id.item1){

                    Toast.makeText(MainActivity.this, "Clicked on item 1", Toast.LENGTH_SHORT).show();

                }

                if(item.getItemId()==R.id.item2){

                    Toast.makeText(MainActivity.this, "Clicked on item 2", Toast.LENGTH_SHORT).show();

                }

                if(item.getItemId()==R.id.item3){

                    Toast.makeText(MainActivity.this, "Clicked on item 3", Toast.LENGTH_SHORT).show();

                }
                return false;
            }
        });

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        drawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        actionBarDrawerToggle.syncState();

    }
}
