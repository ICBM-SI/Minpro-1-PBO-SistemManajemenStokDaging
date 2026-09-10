/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manajemenstokdaging;
import java.util.ArrayList;
import model.Daging;
import model.Karyawan;
import model.StokMasuk;
import model.StokKeluar;
/**
 *
 * @author LENOVO
 */
public class ManajemenStokDaging {

    static ArrayList<Daging> daftarDaging = new ArrayList<>();
    static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    static ArrayList<StokMasuk> daftarStokMasuk = new ArrayList<>();
    static ArrayList<StokKeluar> daftarStokKeluar = new ArrayList<>();

    public static void main(String[] args) {

        // ================== DATA AWAL (HARDCODE) ==================
        daftarDaging.add(new Daging(1, "Daging Sapi", "Paha", 10.5, "01-09-2026", "10-09-2026", 20, "Tersedia"));
        daftarDaging.add(new Daging(2, "Daging Ayam", "Dada", 5.0, "02-09-2026", "05-09-2026", 15, "Tersedia"));
        daftarDaging.add(new Daging(3, "Daging Kambing", "Iga", 8.0, "03-09-2026", "12-09-2026", 10, "Tersedia"));

        daftarKaryawan.add(new Karyawan(1, "Budi", "Admin Gudang"));
        daftarKaryawan.add(new Karyawan(2, "Sari", "Staff Gudang"));

        daftarStokMasuk.add(new StokMasuk(1, 1, 1, 1, "01-09-2026", 20, "Pembelian awal"));
        daftarStokMasuk.add(new StokMasuk(2, 2, 2, 1, "02-09-2026", 15, "Pembelian awal"));

        daftarStokKeluar.add(new StokKeluar(1, 1, 2, "05-09-2026", 3, "Penjualan", "Dijual ke pelanggan"));

        // Simulasi urutan menu yang "dipilih" (menggantikan input keyboard)
        // 1 = Daging, 2 = Karyawan, 3 = Stok Masuk, 4 = Stok Keluar, 0 = Keluar
        int[] urutanMenu = {1, 2, 3, 4, 0};

        int i = 0;
        int pilih;

        // perulangan menu, berhenti saat menemukan pilihan 0 (keluar)
        do {
            pilih = urutanMenu[i];
            System.out.println("\n=== SISTEM MANAJEMEN STOK DAGING ===");
            System.out.println("Menu dipilih: " + pilih);

            // percabangan untuk memilih menu
            switch (pilih) {
                case 1:
                    tampilkanDaging();
                    contohUbahHapusDaging();
                    break;
                case 2:
                    tampilkanKaryawan();
                    break;
                case 3:
                    tampilkanStokMasuk();
                    break;
                case 4:
                    tampilkanStokKeluar();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak dikenal.");
            }
            i++;
        } while (pilih != 0);
    }

    // ---------- TAMPIL DAGING ----------
    static void tampilkanDaging() {
        System.out.println("\n-- Data Daging --");
        System.out.println("ID | Nama | Bagian | Berat | Tgl Masuk | Tgl Expired | Stok | Status");
        for (Daging d : daftarDaging) {
            d.tampilkan();
        }
    }

    // ---------- CONTOH UBAH & HAPUS DAGING (hardcode) ----------
    static void contohUbahHapusDaging() {
        // contoh ubah: stok daging ID 1 dikurangi karena ada stok keluar
        for (Daging d : daftarDaging) {
            if (d.idDaging == 1) {
                d.stok = d.stok - 3;
                System.out.println("\n[Ubah] Stok Daging Sapi (ID 1) diperbarui jadi: " + d.stok);
            }
        }

        // contoh hapus: hapus daging dengan ID 3
        for (int j = 0; j < daftarDaging.size(); j++) {
            if (daftarDaging.get(j).idDaging == 3) {
                System.out.println("[Hapus] Menghapus data: " + daftarDaging.get(j).namaDaging);
                daftarDaging.remove(j);
                break;
            }
        }

        System.out.println("\n-- Data Daging setelah diubah & dihapus --");
        for (Daging d : daftarDaging) {
            d.tampilkan();
        }
    }

    // ---------- TAMPIL KARYAWAN ----------
    static void tampilkanKaryawan() {
        System.out.println("\n-- Data Karyawan --");
        System.out.println("ID | Nama | Jabatan");
        for (Karyawan k : daftarKaryawan) {
            k.tampilkan();
        }
    }

    // ---------- TAMPIL STOK MASUK ----------
    static void tampilkanStokMasuk() {
        System.out.println("\n-- Data Stok Masuk --");
        System.out.println("ID | Daging | Supplier | Karyawan | Tanggal | Jumlah | Keterangan");
        for (StokMasuk s : daftarStokMasuk) {
            s.tampilkan();
        }
    }

    // ---------- TAMPIL STOK KELUAR ----------
    static void tampilkanStokKeluar() {
        System.out.println("\n-- Data Stok Keluar --");
        System.out.println("ID | Daging | Karyawan | Tanggal | Jumlah | Alasan | Keterangan");
        for (StokKeluar s : daftarStokKeluar) {
            s.tampilkan();
        }
    }
}
