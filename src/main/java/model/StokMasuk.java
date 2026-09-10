/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class StokMasuk {
    public int idStokMasuk, idDaging, idSupplier, idKaryawan, jumlah;
    public String tanggalMasuk, keterangan;

    public StokMasuk(int idStokMasuk, int idDaging, int idSupplier, int idKaryawan,
                      String tanggalMasuk, int jumlah, String keterangan) {
        this.idStokMasuk = idStokMasuk;
        this.idDaging = idDaging;
        this.idSupplier = idSupplier;
        this.idKaryawan = idKaryawan;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
    }

    public void tampilkan() {
        System.out.println(idStokMasuk + " | Daging:" + idDaging + " | Supplier:" + idSupplier
                + " | Karyawan:" + idKaryawan + " | " + tanggalMasuk + " | " + jumlah + " | " + keterangan);
    }
}
