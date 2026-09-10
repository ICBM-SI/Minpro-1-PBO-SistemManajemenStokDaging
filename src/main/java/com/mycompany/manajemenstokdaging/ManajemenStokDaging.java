/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manajemenstokdaging;
import java.util.ArrayList;
import java.util.Scanner;
import model.Daging;
import model.Karyawan;
import model.StokMasuk;
import model.StokKeluar;
/**
 *
 * @author LENOVO
 */
public class ManajemenStokDaging {
 
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Daging> daftarDaging = new ArrayList<>();
    static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    static ArrayList<StokMasuk> daftarStokMasuk = new ArrayList<>();
    static ArrayList<StokKeluar> daftarStokKeluar = new ArrayList<>();
 
    static int idDaging = 1, idKaryawan = 1, idStokMasuk = 1, idStokKeluar = 1;
 
    public static void main(String[] args) {
        int pilih;
 
        do {
            System.out.println("\n=== SISTEM MANAJEMEN STOK DAGING ===");
            System.out.println("1. Data Daging");
            System.out.println("2. Data Karyawan");
            System.out.println("3. Stok Masuk");
            System.out.println("4. Stok Keluar");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Integer.parseInt(sc.nextLine());
 
            switch (pilih) {
                case 1: menuDaging(); break;
                case 2: menuKaryawan(); break;
                case 3: menuStokMasuk(); break;
                case 4: menuStokKeluar(); break;
                case 0: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
 
    static void menuDaging() {
        int pilih;
        do {
            System.out.println("\n-- Menu Daging --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Ubah");
            System.out.println("4. Hapus");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());
 
            if (pilih == 1) {
                System.out.print("Nama daging: ");
                String nama = sc.nextLine();
                System.out.print("Bagian daging: ");
                String bagian = sc.nextLine();
                System.out.print("Berat (kg): ");
                double berat = Double.parseDouble(sc.nextLine());
                System.out.print("Tanggal masuk: ");
                String tglMasuk = sc.nextLine();
                System.out.print("Tanggal expired: ");
                String tglExpired = sc.nextLine();
                System.out.print("Stok: ");
                int stok = Integer.parseInt(sc.nextLine());
                System.out.print("Status: ");
                String status = sc.nextLine();
 
                daftarDaging.add(new Daging(idDaging++, nama, bagian, berat, tglMasuk, tglExpired, stok, status));
                System.out.println("Data ditambahkan!");
 
            } else if (pilih == 2) {
                tampilkanDaging();
 
            } else if (pilih == 3) {
                System.out.print("ID daging yang diubah: ");
                int id = Integer.parseInt(sc.nextLine());
                for (Daging d : daftarDaging) {
                    if (d.idDaging == id) {
                        System.out.print("Nama baru: ");
                        d.namaDaging = sc.nextLine();
                        System.out.print("Stok baru: ");
                        d.stok = Integer.parseInt(sc.nextLine());
                        System.out.print("Status baru: ");
                        d.status = sc.nextLine();
                        System.out.println("Data diubah!");
                    }
                }
 
            } else if (pilih == 4) {
                System.out.print("ID daging yang dihapus: ");
                int id = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < daftarDaging.size(); i++) {
                    if (daftarDaging.get(i).idDaging == id) {
                        daftarDaging.remove(i);
                        System.out.println("Data dihapus!");
                        break;
                    }
                }
            }
        } while (pilih != 0);
    }
 
    static void tampilkanDaging() {
        System.out.println("\nID | Nama | Bagian | Berat | Tgl Masuk | Tgl Expired | Stok | Status");
        for (Daging d : daftarDaging) {
            d.tampilkan();
        }
    }
 
    static void menuKaryawan() {
        int pilih;
        do {
            System.out.println("\n-- Menu Karyawan --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());
 
            if (pilih == 1) {
                System.out.print("Nama karyawan: ");
                String nama = sc.nextLine();
                System.out.print("Jabatan: ");
                String jabatan = sc.nextLine();
                daftarKaryawan.add(new Karyawan(idKaryawan++, nama, jabatan));
                System.out.println("Data ditambahkan!");
 
            } else if (pilih == 2) {
                System.out.println("\nID | Nama | Jabatan");
                for (Karyawan k : daftarKaryawan) {
                    k.tampilkan();
                }
            }
        } while (pilih != 0);
    }
 
    static void menuStokMasuk() {
        int pilih;
        do {
            System.out.println("\n-- Menu Stok Masuk --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());
 
            if (pilih == 1) {
                System.out.print("ID daging: ");
                int idD = Integer.parseInt(sc.nextLine());
                System.out.print("ID supplier: ");
                int idS = Integer.parseInt(sc.nextLine());
                System.out.print("ID karyawan: ");
                int idK = Integer.parseInt(sc.nextLine());
                System.out.print("Tanggal masuk: ");
                String tgl = sc.nextLine();
                System.out.print("Jumlah: ");
                int jumlah = Integer.parseInt(sc.nextLine());
                System.out.print("Keterangan: ");
                String ket = sc.nextLine();
 
                daftarStokMasuk.add(new StokMasuk(idStokMasuk++, idD, idS, idK, tgl, jumlah, ket));
 
                for (Daging d : daftarDaging) {
                    if (d.idDaging == idD) d.stok += jumlah;
                }
                System.out.println("Data ditambahkan!");
 
            } else if (pilih == 2) {
                System.out.println("\nID | Daging | Supplier | Karyawan | Tanggal | Jumlah | Keterangan");
                for (StokMasuk s : daftarStokMasuk) {
                    s.tampilkan();
                }
            }
        } while (pilih != 0);
    }
 
    static void menuStokKeluar() {
        int pilih;
        do {
            System.out.println("\n-- Menu Stok Keluar --");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());
 
            if (pilih == 1) {
                System.out.print("ID daging: ");
                int idD = Integer.parseInt(sc.nextLine());
                System.out.print("ID karyawan: ");
                int idK = Integer.parseInt(sc.nextLine());
                System.out.print("Tanggal keluar: ");
                String tgl = sc.nextLine();
                System.out.print("Jumlah: ");
                int jumlah = Integer.parseInt(sc.nextLine());
                System.out.print("Alasan: ");
                String alasan = sc.nextLine();
                System.out.print("Keterangan: ");
                String ket = sc.nextLine();
 
                daftarStokKeluar.add(new StokKeluar(idStokKeluar++, idD, idK, tgl, jumlah, alasan, ket));
 
                for (Daging d : daftarDaging) {
                    if (d.idDaging == idD) d.stok -= jumlah;
                }
                System.out.println("Data ditambahkan!");
 
            } else if (pilih == 2) {
                System.out.println("\nID | Daging | Karyawan | Tanggal | Jumlah | Alasan | Keterangan");
                for (StokKeluar s : daftarStokKeluar) {
                    s.tampilkan();
                }
            }
        } while (pilih != 0);
    }
}
