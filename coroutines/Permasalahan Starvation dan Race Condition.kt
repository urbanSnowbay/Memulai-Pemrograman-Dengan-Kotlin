package coroutines

/* -------------------------Starvation-------------------------
Starvation merupakan sebuah kondisi yang biasanya terjadi setelah deadlock. Kondisi deadlock sering kali menyebabkan sebuah proses kekurangan
sumber daya sehingga mengalami starvation atau kelaparan. Pada kondisi seperti ini, thread tak dapat akses reguler ke sumber daya bersama
dan membuat proses terhenti.
Selain deadlock, hal lain yang bisa mengakibatkan starvation adalah ketika terjadi kesalahan sistem.
Akibatnya, ada ketimpangan dalam pembagian sumber daya. Sebagai contoh, ketika satu proses bisa mendapat sumber daya,
namun tidak dengan proses lain. Biasanya, kesalahan seperti itu disebabkan oleh algoritma penjadwalan (scheduling algorithm) yang kurang tepat atau
bisa juga karena resource leak atau kebocoran sumber daya.

Salah satu solusi untuk starvation adalah dengan menerapkan algoritma penjadwalan dengan antrian prioritas (process priority)
dan juga menerapkan teknik aging atau penuaan. Aging merupakan sebuah teknik yang secara bertahap meningkatkan prioritas sebuah proses
yang menunggu dalam sistem pada waktu yang cukup lama.
*/

/* -------------------------Race Condition-------------------------
Contoh sederhana dari race condition bisa kita lihat pada aplikasi perbelanjaan online. Katakanlah Anda menemukan barang yang ingin Anda beli
di sebuah toko online. Pada halaman deskripsi, tampil informasi bahwa stok barang hanya sisa 1 (satu). Lalu Anda langsung mengambil keputusan
dengan menekan tombol beli. Pada saat yang sama, ada pengguna lain yang ternyata lebih dahulu membelinya. Kondisi seperti inilah yang mengakibatkan
sebuah state atau keadaan, berubah tanpa Anda sadari. Jika sistem tidak dirancang sedemikian rupa, maka masalah tak terduga, bisa mengemuka.
 */

