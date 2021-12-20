package coroutines

/*
Dispatcher.Default merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti launch, async, dll
jika tidak ada dispatcher lain yang ditentukan. Dispatcher.Default menggunakan kumpulan thread yang ada pada JVM.
Pada dasarnya, jumlah maksimal thread yang digunakan adalah sama dengan jumlah core dari CPU.
        launch(Dispatcher.Default){
            // TODO: Implement suspending lambda here
        }
*/