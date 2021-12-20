package coroutines

/*
Job adalah sebuah hasil dari perintah asynchronous yang dijalankan. Objek dari job akan merepresentasikan coroutine yang sebenarnya.
Sebuah job akan memiliki 3 (tiga) properti yang nantinya bisa dipetakan ke dalam setiap state atau keadaan.
Berikut adalah ketiga properti tersebut:

isActive
Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.

isCompleted
Sebuah properti yang menunjukkan ketika sebuah job telah selesai.

isCancelled
Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.
 */