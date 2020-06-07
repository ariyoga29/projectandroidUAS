package com.example.musclely;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;
    private Button btn;

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
        String coret = menubaru.getCoret();

        holder.tvnama.setText(nama);
        holder.tvharga.setText(harga);
        holder.tvcoret.setText(coret);
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
        public TextView tvdeskripsi;
        public TextView tvcoret;

        public MenuViewHolder(@NonNull View itemView) {
                super(itemView);
            ivgambar = itemView.findViewById(R.id.iv_gambar);
            tvnama = itemView.findViewById(R.id.tv_nama);
            tvharga = itemView.findViewById(R.id.tv_harga);
            tvdeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            tvcoret = itemView.findViewById(R.id.tv_coret);

            btn = itemView.findViewById(R.id.btn_pesan);
            btn.setOnClickListener( new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent = new Intent(context, DetailActivity.class);
                    intent.putExtra(DetailActivity.nama, menus.get(getAdapterPosition()).getNama());
                    intent.putExtra(DetailActivity.deskripsi, menus.get(getAdapterPosition()).getDeskripsi());
                    intent.putExtra(DetailActivity.harga, menus.get(getAdapterPosition()).getHarga());
                    intent.putExtra(DetailActivity.gambar, menus.get(getAdapterPosition()).getGambar());
                    intent.putExtra(DetailActivity.coret,menus.get(getAdapterPosition()).getCoret());
                    context.startActivity(intent);
                }

            });
        }
    }
}
