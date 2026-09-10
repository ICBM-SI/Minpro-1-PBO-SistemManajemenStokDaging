/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class StokKeluar {
    public int idStokKeluar, idDaging, idKaryawan, jumlah;
    public String tanggalKeluar, alasan, keterangan;

    public StokKeluar(int idStokKeluar, int idDaging, int idKaryawan, String tanggalKeluar,
                       int jumlah, String alasan, String keterangan) {
        this.idStokKeluar = idStokKeluar;
        this.idDaging = idDaging;
        this.idKaryawan = idKaryawan;
        this.tanggalKeluar = tanggalKeluar;
        this.jumlah = jumlah;
        this.alasan = alasan;
        this.keterangan = keterangan;
    }

    public void tampilkan() {
        System.out.println(idStokKeluar + " | Daging:" + idDaging + " | Karyawan:" + idKaryawan
                + " | " + tanggalKeluar + " | " + jumlah + " | " + alasan + " | " + keterangan);
    }
}
