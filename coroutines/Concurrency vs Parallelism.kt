package coroutines

/*
Concurrency terjadi apabila terdapat 2 (dua) atau lebih proses yang tumpang tindih dalam satu waktu.
Ini bisa terjadi jika ada 2 (dua) atau lebih thread yang sedang aktif.
Dan jika thread tersebut dijalankan oleh komputer yang hanya memiliki 1 (satu) core, semua thread tidak akan dijalankan secara paralel.
Concurrency memungkinkan sebuah komputer yang hanya memiliki 1 (satu) core tampak seakan mengerjakan banyak tugas sekaligus.
Padahal sebenarnya tugas-tugas tersebut dilakukan secara bergantian.
*/

/*
Sedangkan parallelism terjadi ketika 2 (dua) proses dijalankan pada titik waktu yang sama persis.
Parallelism bisa dilakukan jika terdapat 2 (dua) atau lebih thread dan komputer juga memiliki 2 (dua) core atau lebih.
Sehingga setiap core dapat menjalankan perintah dari masing-masing thread secara bersamaan.
*/

/*
Concurrency ibarat seperti seorang barista yg melayani beberapa pelanggan
*/

/*
Sedangkan parallelism ibarat seperti 2 orang barista yg melayani beberapa pelanggan
Karena kedua barista tersebut telah berbagi tugas, maka mereka akan bertindak secara paralel sehubungan dengan tugas yang lebih besar
dalam melayani pelanggan.
*/

/*
Bagaimanapun, selama jumlah barista belum sama dengan jumlah pelanggan, concurrency masih tetap diperlukan pada masing-masing barista tersebut.
Artinya, parallelism dapat menimbulkan concurrency, tetapi concurrency bisa terjadi tanpa parallelism.
*/