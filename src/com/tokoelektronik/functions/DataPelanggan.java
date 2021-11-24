package com.tokoelektronik.functions;

public class DataPelanggan {
    
    private String idPelanggan;
    private String namaPelanggan;
    private int umur;
    private String noTelepon;
    
    public DataPelanggan(){
        
        
    }

    public DataPelanggan(String idPelanggan, String namaPelanggan, int umur, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.umur = umur;
        this.noTelepon = noTelepon;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public int getUmur() {
        return umur;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
    
}
