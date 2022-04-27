package com.theost.navigationapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.theost.navigationapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.openDrawerNavigation.setOnClickListener(view -> startDrawerNavigationActivity());
        binding.openBottomNavigation.setOnClickListener(view -> startBottomNavigationActivity());
    }

    private void startDrawerNavigationActivity() {
        startActivity(new Intent(this, NavigationDrawerActivity.class));
    }

    private void startBottomNavigationActivity() {
        startActivity(new Intent(this, NavigationBottomActivity.class));
    }
}
