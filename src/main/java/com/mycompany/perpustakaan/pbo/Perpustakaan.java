/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaan.pbo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kategori = {"Pemrograman", "Matematika", "Jaringan Komputer", "Basis Data"};
        int[][] peminjaman = new int[4][7];
        String[][][] lokasiBuku = new String[3][5][5];

        ArrayList<String> daftarBuku = new ArrayList<>();
        Stack<String> riwayat = new Stack<>();
        Queue<String> antrean = new LinkedList<>();

        daftarBuku.add("Pemrograman Java Dasar");1
                
        daftarBuku.add("Kalkulus Lanjut");
        daftarBuku.add("Konsep Jaringan Komputer");
        daftarBuku.add("Desain Basis Data Relasional");

        lokasiBuku[0][0][0] = "Pemrograman Java Dasar";
        lokasiBuku[1][2][1] = "Kalkulus Lanjut";

        peminjaman[0][0] = 5;
        peminjaman[1][2] = 3;
        peminjaman[2][4] = 8;
        peminjaman[3][1] = 4;

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN KAMPUS ===");
            System.out.println("1. Kelola Daftar Buku (ArrayList)");
            System.out.println("2. Tampilkan Kategori Buku (Array 1D)");
            System.out.println("3. Rekap Peminjaman Mingguan (Array 2D)");
            System.out.println("4. Cek dan Atur Lokasi Buku (Array 3D)");
            System.out.println("5. Antrean Mahasiswa (Queue)");
            System.out.println("6. Riwayat Transaksi dan Batal Pinjam (Stack)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n--- MANAJEMEN BUKU (ARRAYLIST) ---");
                    System.out.println("1. Tambah Buku");
                    System.out.println("2. Tampilkan Semua Buku");
                    System.out.println("3. Hapus Buku");
                    System.out.print("Pilih opsi: ");
                    int subMenuBuku = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenuBuku == 1) {
                        System.out.print("Masukkan judul buku baru: ");
                        String judulBaru = scanner.nextLine();
                        daftarBuku.add(judulBaru);
                        System.out.println("Buku berhasil ditambahkan.");
                    } else if (subMenuBuku == 2) {
                        System.out.println("Daftar Buku Saat Ini:");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarBuku.get(i));
                        }
                    } else if (subMenuBuku == 3) {
                        System.out.println("Pilih nomor buku yang ingin dihapus:");
                        for (int i = 0; i < daftarBuku.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarBuku.get(i));
                        }
                        System.out.print("Nomor: ");
                        int hapusIndex = scanner.nextInt() - 1;
                        scanner.nextLine();
                        if (hapusIndex >= 0 && hapusIndex < daftarBuku.size()) {
                            String terhapus = daftarBuku.remove(hapusIndex);
                            System.out.println("Buku '" + terhapus + "' berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR KATEGORI BUKU (ARRAY 1D) ---");
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.println((i + 1) + ". " + kategori[i]);
                    }
                    break;

                case 3:
                    System.out.println("\n--- REKAP PEMINJAMAN MINGGUAN (ARRAY 2D) ---");
                    String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
                    System.out.printf("%-25s", "Kategori");
                    for (String h : hari) {
                        System.out.printf("%-10s", h);
                    }
                    System.out.println();

                    for (int i = 0; i < kategori.length; i++) {
                        System.out.printf("%-25s", kategori[i]);
                        for (int j = 0; j < 7; j++) {
                            System.out.printf("%-10d", peminjaman[i][j]);
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("\n--- LOKASI BUKU (ARRAY 3D) ---");
                    System.out.println("1. Simpan Buku ke Rak");
                    System.out.println("2. Cek Isi Rak");
                    System.out.print("Pilih opsi: ");
                    int opsiRak = scanner.nextInt();
                    scanner.nextLine();

                    if (opsiRak == 1) {
                        System.out.print("Lantai (0-2): ");
                        int lantai = scanner.nextInt();
                        System.out.print("Nomor Rak (0-4): ");
                        int rak = scanner.nextInt();
                        System.out.print("Posisi Slot (0-4): ");
                        int slot = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Judul Buku: ");
                        String judul = scanner.nextLine();

                        lokasiBuku[lantai][rak][slot] = judul;
                        System.out.println("Buku berhasil disimpan ke rak.");
                    } else if (opsiRak == 2) {
                        System.out.print("Lantai (0-2): ");
                        int lantai = scanner.nextInt();
                        System.out.print("Nomor Rak (0-4): ");
                        int rak = scanner.nextInt();
                        System.out.print("Posisi Slot (0-4): ");
                        int slot = scanner.nextInt();
                        scanner.nextLine();

                        String hasil = lokasiBuku[lantai][rak][slot];
                        if (hasil != null) {
                            System.out.println("Ditemukan buku: " + hasil);
                        } else {
                            System.out.println("Slot rak masih kosong.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- ANTREAN PEMINJAMAN (QUEUE) ---");
                    System.out.println("1. Tambah Mahasiswa ke Antrean");
                    System.out.println("2. Panggil / Layani Mahasiswa");
                    System.out.println("3. Lihat Seluruh Antrean");
                    System.out.print("Pilih opsi: ");
                    int opsiQueue = scanner.nextInt();
                    scanner.nextLine();

                    if (opsiQueue == 1) {
                        System.out.print("Nama Mahasiswa: ");
                        String nama = scanner.nextLine();
                        antrean.add(nama);
                        System.out.println(nama + " berhasil masuk antrean.");
                    } else if (opsiQueue == 2) {
                        if (!antrean.isEmpty()) {
                            String dilayani = antrean.poll();
                            System.out.println("Melayani: " + dilayani);
                        } else {
                            System.out.println("Antrean sedang kosong.");
                        }
                    } else if (opsiQueue == 3) {
                        System.out.println("Urutan antrean: " + antrean);
                    }
                    break;

                case 6:
                    System.out.println("\n--- RIWAYAT TRANSAKSI (STACK) ---");
                    System.out.println("1. Catat Transaksi Baru");
                    System.out.println("2. Batalkan Transaksi Terakhir (Undo)");
                    System.out.println("3. Intip Transaksi Terakhir");
                    System.out.print("Pilih opsi: ");
                    int opsiStack = scanner.nextInt();
                    scanner.nextLine();

                    if (opsiStack == 1) {
                        System.out.print("Keterangan transaksi: ");
                        String transaksi = scanner.nextLine();
                        riwayat.push(transaksi);
                        System.out.println("Transaksi tercatat.");
                    } else if (opsiStack == 2) {
                        if (!riwayat.isEmpty()) {
                            String dibatalkan = riwayat.pop();
                            System.out.println("Transaksi dibatalkan: " + dibatalkan);
                        } else {
                            System.out.println("Tidak ada transaksi untuk dibatalkan.");
                        }
                    } else if (opsiStack == 3) {
                        if (!riwayat.isEmpty()) {
                            System.out.println("Transaksi paling akhir: " + riwayat.peek());
                        } else {
                            System.out.println("Riwayat transaksi kosong.");
                        }
                    }
                    break;

                case 0:
                    berjalan = false;
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
