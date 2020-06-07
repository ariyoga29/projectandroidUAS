package com.example.musclely;

public class Menu {
    private String nama;
    private String harga;
    private String gambar;
    private String deskripsi;
    private String coret;

    public Menu(String datanama, String dataharga, String datagambar, String datadeskripsi, String datacoret){
        nama = datanama;
        harga = dataharga;
        gambar = datagambar;
        deskripsi = datadeskripsi;
        coret = datacoret;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getCoret() {
        return coret;
    }
}
