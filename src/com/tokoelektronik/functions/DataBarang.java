package com.tokoelektronik.functions;

public class DataBarang {
    
    private String idBarang;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    
    public DataBarang(){
        
        
    }

    public DataBarang(String idBarang, String namaBarang, int hargaBarang, int jumlahBarang) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }
    
    
    
    
    
    
}
