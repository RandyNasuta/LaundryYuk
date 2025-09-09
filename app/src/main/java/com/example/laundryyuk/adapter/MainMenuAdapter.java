package com.example.laundryyuk.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laundryyuk.databinding.ListMenuBinding;
import com.example.laundryyuk.model.MainMenuItem;
import java.util.ArrayList;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.MyViewHolder> {

    private ArrayList<MainMenuItem> mainMenuItems;

    public MainMenuAdapter(ArrayList<MainMenuItem> mainMenuItems){
        this.mainMenuItems = mainMenuItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListMenuBinding binding = ListMenuBinding.inflate(inflater, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuAdapter.MyViewHolder holder, int position) {
        MainMenuItem item = mainMenuItems.get(position);
        holder.binding.llCardMenu.setBackgroundResource(item.getColor());
        holder.binding.imgMenuIcon.setImageResource(item.getImage1());
        holder.binding.txtMenuTitle.setText(item.getTitle());
        holder.binding.imgMenuIcon2.setImageResource(item.getImage2());
    }

    @Override
    public int getItemCount() {
        return mainMenuItems == null ? 0 : mainMenuItems.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private ListMenuBinding binding;

        public MyViewHolder(ListMenuBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
