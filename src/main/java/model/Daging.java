/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Daging {
    public int idDaging;
    public String namaDaging, bagianDaging, tanggalMasuk, tanggalExpired, status;
    public double berat;
    public int stok;
 
    public Daging(int idDaging, String namaDaging, String bagianDaging, double berat,
                  String tanggalMasuk, String tanggalExpired, int stok, String status) {
        this.idDaging = idDaging;
        this.namaDaging = namaDaging;
        this.bagianDaging = bagianDaging;
        this.berat = berat;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalExpired = tanggalExpired;
        this.stok = stok;
        this.status = status;
    }
 
    public void tampilkan() {
        System.out.println(idDaging + " | " + namaDaging + " | " + bagianDaging + " | "
                + berat + "kg | " + tanggalMasuk + " | " + tanggalExpired + " | "
                + stok + " | " + status);
    }
}
