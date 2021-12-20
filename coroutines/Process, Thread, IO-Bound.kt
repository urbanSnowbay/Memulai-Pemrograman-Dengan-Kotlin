package coroutines

/* -------------------------PROCESS-------------------------
Sebuah proses (process) merupakan bagian dari aplikasi yang sedang dijalankan. Setiap kali aplikasi dijalankan, maka saat itu juga proses dijalankan.
Tergantung pada sistem operasi yang digunakan, suatu proses dapat terdiri dari beberapa thread yang menjalankan instruksi secara bersamaan
Kita pasti mengenal dengan sebuah konsep yang bernama multitasking atau melakukan banyak tugas secara bersamaan.

Saat multitasking, sebenarnya sistem operasi hanya beralih di antara berbagai proses dengan sangat cepat untuk memberikan kesan bahwa proses ini
sedang dijalankan secara bersamaan. Sebaliknya, multiprocessing adalah metode untuk menggunakan lebih dari satu CPU dalam menjalankan tugas.
Dalam concurrency dan parallelism, multiprocessing mengacu pada pelaksanaan berbagai proses bersamaan dalam suatu sistem operasi,
di mana setiap proses dieksekusi pada CPU terpisah. Oleh karena itu, multiprocessing merupakan tantangan tersendiri bagi developer
dalam mengembangkan sebuah aplikasi.
*/

/* -------------------------THREAD-------------------------
Thread biasa dikenal dengan proses yang ringan. Membuat thread baru membutuhkan lebih sedikit sumber daya daripada membuat proses baru.
Sebuah thread mencakup serangkaian instruksi untuk dijalankan oleh prosesor. Sehingga suatu proses akan memiliki setidaknya satu thread,
yang dibuat untuk mengeksekusi fungsi utama dari sebuah aplikasi. Secara umum, thread tersebut disebut dengan main thread,
dan life cycle dari sebuah proses akan terikat padanya.
Perbedaan utama antara proses dan thread adalah bahwa thread biasanya merupakan komponen dari suatu proses.
Selain itu, thread biasanya memungkinkan untuk berbagi sumber daya seperti memori dan data.
Dimana 2 (dua) hal tersebut jarang dilakukan oleh sebuah proses.

Hanya satu dari instruksi dalam sebuah thread yang dapat dijalankan pada waktu tertentu.
Jadi, jika sebuah thread terblokir, instruksi lain dalam thread yang sama tidak akan dijalankan sampai pemblokiran tersebut berakhir.
Namun demikian, banyak thread dapat dibuat untuk proses yang sama, dan mereka dapat berkomunikasi satu sama lain.
Jadi diharapkan aplikasi tidak akan pernah memblokir thread yang dapat mempengaruhi pengalaman pengguna secara negatif.
UI thread berfungsi untuk memperbarui user interface (antarmuka) dan juga merespon aksi yang diberikan pada aplikasi.
Jika thread ini diblokir, maka semua tugasnya akan terhalangi. Oleh karena itu, jangan sampai kita memblokir UI thread agar aplikasi tetap berjalan
dengan semestinya.
*/

/* -------------------------I/O-BOUND-------------------------
I/O-bound merupakan sebuah algoritma yang bergantung pada perangkat input atau output. Waktu untuk mengeksekusi sebuah I/O-bound tergantung pada
kecepatan perangkat yang digunakan. Sebagai contoh, suatu algoritma untuk membaca dan menulis sebuah dokumen.
Ini adalah operasi I/O yang akan tergantung pada kecepatan di mana berkas tersebut dapat diakses.
Berkas yang disimpan pada SSD akan lebih cepat diakses dibandingkan berkas yang disimpan pada HDD.

Algoritma I/O-bound akan selalu menunggu sesuatu yang lain. Penantian terus-menerus ini memungkinkan perangkat yang hanya memiliki satu core
untuk menggunakan prosesor demi tugas-tugas bermanfaat lainnya sambil menunggu. Jadi algoritma concurrent yang terikat dengan I/O akan melakukan
hal yang sama, terlepas dari eksekusi yang terjadi -apakah paralel atau dalam satu core?
*/