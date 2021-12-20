package coroutines

/* -------------------------DEADLOCK-------------------------
Kasus deadlocks sebenarnya bisa kita amati pada kehidupan nyata.antrian dua mobil yang sama-sama akan menyeberangi sebuah jembatan.
Jembatan tersebut bisa kita analogikan sebagai sebuah resource yang dibutuhkan oleh kedua antrian kendaraan.
Karena keduanya saling membutuhkan jembatan dalam waktu yang sama, maka yang terjadi adalah saling menunggu.
Alhasil, tak ada kemajuan pada proses antrian tersebut. Mau tidak mau, salah satu kendaraan harus ada yang mengalah atau dikalahkan.
 */

/* -------------------------PROCESS-------------------------
Pernahkah suatu ketika Anda berjalan di trotoar dan secara tidak langsung berhadapan dengan orang lain yang berjalan lurus tepat ke arah Anda?
Secara spontan pasti Anda dan orang tersebut akan berusaha menghindari satu sama lain dengan bergerak ke satu sisi.
Tak jarang, Anda bergerak ke kiri sementara orang di depan Anda bergerak ke kanan.
Dan karena kalian berdua berjalan di arah yang berlawanan, tentunya malah menghalangi jalan masing-masing.
Livelock bisa terjadi ketika beberapa proses bisa bereaksi saat mengalami deadlocks. Proses tersebut mencoba keluar dari situasi deadlock, namun waktu yang tidak tepat, menghalanginya.
 */

