package com.example.laundryyuk;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.laundryyuk.adapter.MainMenuAdapter;
import com.example.laundryyuk.databinding.ActivityMainBinding;
import com.example.laundryyuk.model.MainMenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayList<MainMenuItem> items = new ArrayList<>();

        items.add(
                new MainMenuItem(
                        R.color.pink,
                        "Laundry",
                        R.drawable.laundry_svg,
                        R.drawable.laundry_image
                )
        );

        items.add(
                new MainMenuItem(
                        R.color.blue,
                        "Riwayat",
                        R.drawable.gui_history_svg,
                        R.drawable.laundry_image
                )
        );

        items.add(
                new MainMenuItem(
                        R.color.yellow,
                        "Laporan",
                        R.drawable.open_book_svg,
                        R.drawable.laundry_image
                )
        );

        binding.rvMenu.setLayoutManager(new LinearLayoutManager(this));
        MainMenuAdapter adapter = new MainMenuAdapter(items);
        binding.rvMenu.setAdapter(adapter);
    }
}