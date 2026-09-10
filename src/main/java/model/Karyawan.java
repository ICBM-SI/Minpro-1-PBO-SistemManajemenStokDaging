/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Karyawan {
    public int idKaryawan;
    public String namaKaryawan, jabatan; {

    public Karyawan(int idKaryawan, String namaKaryawan, String jabatan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }

    public void tampilkan() {
        System.out.println(idKaryawan + " | " + namaKaryawan + " | " + jabatan);
    }
}
