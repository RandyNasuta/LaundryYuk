package com.example.laundryyuk.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.laundryyuk.R;
import com.example.laundryyuk.adapter.MainMenuAdapter;
import com.example.laundryyuk.databinding.FragmentHomeBinding;
import com.example.laundryyuk.model.MainMenuItem;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<MainMenuItem> items = new ArrayList<>();

        items.add(
                new MainMenuItem(
                        R.color.pink,
                        "Laundry",
                        R.drawable.laundry_svg
                )
        );

        items.add(
                new MainMenuItem(
                        R.color.blue,
                        "Riwayat",
                        R.drawable.gui_history_svg
                )
        );

        items.add(
                new MainMenuItem(
                        R.color.yellow,
                        "Laporan",
                        R.drawable.open_book_svg
                )
        );

        binding.rvMenu.setLayoutManager(new LinearLayoutManager(requireContext()));
        MainMenuAdapter adapter = new MainMenuAdapter(items);
        binding.rvMenu.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}