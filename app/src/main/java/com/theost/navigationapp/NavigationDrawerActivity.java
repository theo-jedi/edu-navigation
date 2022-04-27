package com.theost.navigationapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.theost.navigationapp.databinding.ActivityNavigationDrawerBinding;

public class NavigationDrawerActivity extends AppCompatActivity {

    private ActivityNavigationDrawerBinding binding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNavigationDrawerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.navigationDrawer.setNavigationItemSelectedListener(item -> {
            binding.getRoot().close();
            switch (item.getItemId()) {
                case R.id.nav_first:
                    startFragment(FirstFragment.newInstance());
                    return true;
                case R.id.nav_second:
                    startFragment(SecondFragment.newInstance());
                    return true;
                case R.id.nav_third:
                    startFragment(ThirdFragment.newInstance());
                    return true;
                default:
                    return false;
            }
        });

        binding.toolbar.setNavigationOnClickListener(view -> binding.getRoot().open());

        binding.navigationDrawer.setCheckedItem(R.id.nav_first);
        startFragment(FirstFragment.newInstance());
    }

    private void startFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}