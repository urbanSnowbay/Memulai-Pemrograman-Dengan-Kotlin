package coroutines

/*
Kenapa coroutines sering disebut sebagai thread yang ringan? Coroutines juga mendefinisikan eksekusi dari sekumpulan instruksi untuk dieksekusi oleh prosesor. Selain itu, coroutines juga memiliki life cycle yang sama dengan thread.
Walaupun coroutines dan threads bekerja dengan cara sama, coroutines jauh lebih ringan dan efisien. Jutaan coroutines dapat berjalan pada beberapa threads.
Jika dibandingkan dengan threads, coroutines tidak hanya mudah diterapkan, melainkan juga jauh lebih powerful.
Kelebihan tersebut terutama berlaku pada lingkungan mobile, di mana setiap milliseconds kenaikan kinerja sangat diperhitungkan.
Selain itu, perbedaan lainnya adalah coroutines dikelola oleh pengguna, sedangkan threads dikelola oleh sistem operasi.

Coroutines dijalankan di dalam threads. Satu thread dapat memiliki banyak coroutine di dalamnya.
Artinya, jika Anda memiliki sepuluh coroutines di thread yang sama, hanya satu dari sepuluh coroutines tersebut yang akan berjalan pada titik waktu
tertentu.

Walaupun coroutines dijalankan dalam sebuah thread, perlu diperhatikan bahwa keduanya tak saling terikat. Menariknya, kita juga bisa menjalankan
bagian dari coroutine dalam sebuah thread, menundanya, kemudian melanjutkannya pada thread yang berbeda. Coroutines cukup fleksibel untuk kita
menentukan- Apakah suatu thread akan menjalankan sebuah coroutine atau justru menahannya?
*/