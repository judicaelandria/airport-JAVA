package com.example.training;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Explore extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Deque<Integer> integerDeque = new ArrayDeque<>(3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        RecyclerView rvApps = (RecyclerView) findViewById(R.id.list_apps);

        // initialize apps
        ArrayList<App> apps = new ArrayList<App>();
        apps.add(0,new App("Check", "Productivity", R.drawable.check_icon));
        apps.add(1,new App("Port App", "Play Store", R.drawable.ic_launcher_foreground));
        apps.add(3,new App("App port", "Play Store", R.drawable.app_port));

        AppAdapter adapter = new AppAdapter(apps);
        rvApps.setAdapter(adapter);
        rvApps.setLayoutManager(new LinearLayoutManager(this));

        // config for bottom navigation view
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        integerDeque.push(R.id.explore);

    }

    private void loadFragment(Fragment fragment) {
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.f)
    }
}