package com.example.musclely;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;

    public MenuAdapter(Context mcontext, ArrayList<Menu> menusupplement){
        context = mcontext;
        menus = menusupplement;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru = menus.get(position);
        String gambarbaru = menubaru.getGambar();
        String harga = menubaru.getHarga();
        String nama = menubaru.getNama();

        holder.tvnama.setText(nama);
        holder.tvharga.setText(harga);
    Glide
            .with(context)
            .load(gambarbaru)
            .centerCrop()
            .into(holder.ivgambar);

    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivgambar;
        public TextView tvnama;
        public TextView tvharga;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            ivgambar = itemView.findViewById(R.id.iv_gambar);
            tvnama = itemView.findViewById(R.id.tv_nama);
            tvharga = itemView.findViewById(R.id.tv_harga);

        }
    }

}
