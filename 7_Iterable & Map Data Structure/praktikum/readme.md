<h2>Penjelasan kode & hasil</h2>

<b>No.1</b>

<p>No.1 merupakan program Java yang digunakan untuk menggabungkan dua buah array string dan menyaring elemen yang sama sehingga hanya menampilkan elemen yang unik.</p><br>

<p>Pada baris 4-6, dibuat dua buah array string sebagai contoh kasus uji program. Kemudian, pada baris 9, dilakukan pemanggilan fungsi mergeArrays yang akan menggabungkan dua buah array arr1 dan arr2 dan menyaring elemen yang sama. Hasil penggabungan dan penyaringan kemudian dicetak pada baris 12 menggunakan fungsi Arrays.toString().</p></br>

<p>Pada fungsi mergeArrays (baris 15-23), dilakukan penggabungan dua buah array dengan menggunakan ArrayList. Dua buah array tersebut ditambahkan ke dalam sebuah ArrayList bernama mergedList. Kemudian, mergedList dikonversi menjadi sebuah HashSet pada baris 20 untuk menghapus elemen yang sama. Setelah itu, hasil penggabungan dan penyaringan dikembalikan dalam bentuk array string pada baris 24 menggunakan fungsi toArray().</p></br>
<br>

<b>No.2</b>

<p>Program di atas merupakan sebuah program Java yang memiliki 2 buah method yaitu "angkaMuncul" dan "angkaTampil" yang digunakan untuk mengekstrak angka yang muncul sekali atau tidak sama sekali dalam sebuah string input.</p></br>

<p>Pada method "angkaMuncul", string input akan diproses secara iteratif dan kemudian diperiksa apakah karakter yang sedang diproses muncul lebih dari satu kali atau tidak sama sekali. Jika karakter hanya muncul sekali, maka karakter tersebut akan ditambahkan ke dalam sebuah list yang bernama "randomAngka". List "randomAngka" akan berisi semua angka yang muncul hanya sekali dalam string input.</p></br>

<p>Sementara itu, method "angkaTampil" memiliki logika yang sama dengan method "angkaMuncul", namun output yang dihasilkan akan berbeda karena semua karakter yang hanya muncul sekali tidak ada pada string input "input1". Oleh karena itu, output dari method "angkaTampil" adalah sebuah list kosong.</p></br>

<p>Pada method "main", kedua method tersebut dipanggil untuk menguji fungsinya dengan memberikan string input tertentu. Hasil yang dihasilkan akan dicetak menggunakan fungsi "System.out.println()". Pada program di atas, hasil yang dihasilkan dari method "angkaMuncul" adalah list [6, 3], sedangkan hasil yang dihasilkan dari method "angkaTampil" adalah list kosong ([]).</p></br>
<br>

<b>No.3</b>

<p>Program diatas adalah program untuk mencari pasangan angka pada sebuah array yang jumlahnya sama dengan target yang diberikan. Program ini menggunakan metode one-pass hash table dengan kompleksitas O(n), dimana n adalah panjang array input. Program ini terdiri dari dua method, yaitu method twoSum dan method main.</p></br>
<br>

<b>No.4</b>

<p>Program diatas bertujuan untuk menggabungkan dua buah array dan menghasilkan array baru yang berisi elemen unik dari array pertama yang tidak ada di array kedua.</p></br>

<p>Cara kerjanya adalah dengan mengubah array kedua menjadi set untuk memudahkan pencarian elemen yang sama, kemudian dilakukan iterasi pada array pertama untuk menambahkan elemen ke dalam list baru jika elemen tersebut tidak ada di dalam set. Setelah itu, list baru tersebut diubah kembali menjadi array dan di-return sebagai hasil akhir.</p></br>

<p>Output dari program diatas adalah [2, 4], karena elemen 2 dan 4 adalah elemen unik dari array pertama yang tidak ada di array kedua.</p></br>
<br>

<b>No.5</b>

<p>Program di atas merupakan sebuah program untuk menghapus elemen duplikat pada array menggunakan konsep two pointers. Program menerima input berupa dua buah array, kemudian melakukan penghapusan elemen yang duplikat pada setiap array. Program kemudian mencetak panjang elemen masing-masing array setelah proses penghapusan elemen duplikat dilakukan.</p></br>
<br>

<b>No.6</b>

<p>Program diatas adalah sebuah program untuk mencari subarray dengan jumlah elemen maksimum dari suatu array. Program ini menerima input array integer arr dan integer k, dimana k adalah panjang subarray yang ingin dicari. Program kemudian menghitung jumlah elemen dari k elemen pertama dari array, lalu menggeser jendela subarray sepanjang k elemen pada setiap iterasi dan menghitung kembali jumlah elemen dari subarray tersebut. Setelah menghitung jumlah elemen dari subarray pada setiap iterasi, program mencari subarray dengan jumlah elemen maksimum dan mengembalikan jumlah elemennya. Program menghasilkan output berupa jumlah elemen maksimum dari subarray pada dua contoh array arr1 dan arr2.</p></br>