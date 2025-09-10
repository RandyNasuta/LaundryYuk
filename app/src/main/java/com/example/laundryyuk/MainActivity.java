package com.example.laundryyuk;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.laundryyuk.databinding.ActivityMainBinding;
import com.example.laundryyuk.fragment.HomeFragment;
import com.example.laundryyuk.fragment.NotificationFragment;
import com.example.laundryyuk.fragment.ProfileFragment;
import com.google.android.material.navigation.NavigationBarView;
import com.example.laundryyuk.R;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
              replaceFragment(new HomeFragment());
              return true;
            } else if (item.getItemId() == R.id.notification) {
                replaceFragment(new NotificationFragment());
                return true;
            } else if (item.getItemId() == R.id.profile) {
                replaceFragment(new ProfileFragment());
                return true;
            }
            return false;
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragmentMain, fragment);
        fragmentTransaction.commit();
    }
}