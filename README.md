# Sistem Manajemen Perpustakaan Kampus
Perpustakaan kampus membutuhkan sistem terkomputerisasi sederhana untuk membantu pengelolaan operasional harian. Pengelolaan secara manual sering menyebabkan kendala seperti sulitnya melacak posisi buku di rak, pencatatan jumlah peminjaman yang tidak rapi, antrean mahasiswa yang tidak teratur saat jam sibuk, serta kesalahan input transaksi yang tidak bisa dibatalkan.

## Tugas Pemrograman Java
- **Mata Kuliah:** Pemrograman Berorientasi Objek
- **Dosen Pengampu:** M. Ibadurrahman Arrasyid Supriyanto M.Kom.
- **Program Studi:** Sistem Informasi
- **Angkatan:** 2025
- **Kelompok:** 17
  
## Anggota Kelompok 17
1. AHMAD AFIF AL GHIFARY	2509116002 Kelas A
2. MUHAMMAD IBRAHIM KAMIL	2509116012 Kelas A
3. M. ARHAM ANUGRAH	2509116044 Kelas B
4. M. RIZKY ALFA REZA BASYAH	2509116086 Kelas C

## Penjelasan
1.	Array 1 Dimensi (1D): 
Diterapkan pada variabel kategori bertipe String[] dengan kapasitas 4 elemen statis (Pemrograman, Matematika, Jaringan Komputer, dan Basis Data). Struktur ini dipilih karena daftar kategori utama perpustakaan jarang berubah.
2.	Array 2 Dimensi (2D): 
Diterapkan pada variabel peminjaman bertipe int[][] berukuran 4 baris dan 7 kolom. Baris mewakili 4 kategori buku, sedangkan kolom mewakili 7 hari dalam seminggu (Senin sampai Minggu).
3.	Array 3 Dimensi (3D): 
Diterapkan pada variabel lokasiBuku bertipe String[][][] berukuran 3 x 5 x 5. Indeks dimensi pertama mewakili lantai (0–2), dimensi kedua mewakili nomor rak (0–4), dan dimensi ketiga mewakili posisi slot buku (0–4).
4.	ArrayList: 
Diterapkan pada variabel daftarBuku. Berbeda dengan Array biasa yang ukurannya kaku, ArrayList memungkinkan ukuran koleksi buku bertambah atau berkurang secara otomatis saat pustakawan menambah buku baru atau menghapus buku lama.
5.	Queue (FIFO - First In First Out): 
Diterapkan pada variabel antrean menggunakan LinkedList. Mahasiswa yang pertama kali mendaftar di antrean akan dilayani dan dipanggil keluar terlebih dahulu.
6.	Stack (LIFO - Last In First Out): 
Diterapkan pada variabel riwayat. Transaksi yang paling terakhir dimasukkan akan berada di posisi paling atas, sehingga memudahkan petugas untuk melihat aktivitas terbaru atau membatalkan transaksi yang baru saja diinput.

