<h2>Penjelasan kode & hasil</h2>

<b>No.1</b>
![Kode No 1](https://user-images.githubusercontent.com/74763171/225586040-96728920-cf68-477d-8157-f08bb084e30a.JPG)
<p>No.1 merupakan program Java yang digunakan untuk menggabungkan dua buah array string dan menyaring elemen yang sama sehingga hanya menampilkan elemen yang unik.</p>

<p>Pada baris 4-6, dibuat dua buah array string sebagai contoh kasus uji program. Kemudian, pada baris 9, dilakukan pemanggilan fungsi mergeArrays yang akan menggabungkan dua buah array arr1 dan arr2 dan menyaring elemen yang sama. Hasil penggabungan dan penyaringan kemudian dicetak pada baris 12 menggunakan fungsi Arrays.toString().</p>

<p>Pada fungsi mergeArrays (baris 15-23), dilakukan penggabungan dua buah array dengan menggunakan ArrayList. Dua buah array tersebut ditambahkan ke dalam sebuah ArrayList bernama mergedList. Kemudian, mergedList dikonversi menjadi sebuah HashSet pada baris 20 untuk menghapus elemen yang sama. Setelah itu, hasil penggabungan dan penyaringan dikembalikan dalam bentuk array string pada baris 24 menggunakan fungsi toArray().</p></br>

<b>Output No.1</b>
![Output No 1](https://user-images.githubusercontent.com/74763171/225586916-e2bdf195-cb3e-4470-9d1d-875f4634bd56.JPG)

</br>

<b>No.2</b>
![Kode No 2](https://user-images.githubusercontent.com/74763171/225587663-174487bd-2be7-4747-a1b8-2e49b7c31ea4.JPG)
<p>Program di atas merupakan sebuah program Java yang memiliki 2 buah method yaitu "angkaMuncul" dan "angkaTampil" yang digunakan untuk mengekstrak angka yang muncul sekali atau tidak sama sekali dalam sebuah string input.</p>

<p>Pada method "angkaMuncul", string input akan diproses secara iteratif dan kemudian diperiksa apakah karakter yang sedang diproses muncul lebih dari satu kali atau tidak sama sekali. Jika karakter hanya muncul sekali, maka karakter tersebut akan ditambahkan ke dalam sebuah list yang bernama "randomAngka". List "randomAngka" akan berisi semua angka yang muncul hanya sekali dalam string input.</p>

<p>Sementara itu, method "angkaTampil" memiliki logika yang sama dengan method "angkaMuncul", namun output yang dihasilkan akan berbeda karena semua karakter yang hanya muncul sekali tidak ada pada string input "input1". Oleh karena itu, output dari method "angkaTampil" adalah sebuah list kosong.</p>

<p>Pada method "main", kedua method tersebut dipanggil untuk menguji fungsinya dengan memberikan string input tertentu. Hasil yang dihasilkan akan dicetak menggunakan fungsi "System.out.println()". Pada program di atas, hasil yang dihasilkan dari method "angkaMuncul" adalah list [6, 3], sedangkan hasil yang dihasilkan dari method "angkaTampil" adalah list kosong ([]).</p></br>

<b>Output No.2</b>
![Output No 2](https://user-images.githubusercontent.com/74763171/225587853-2f8d99c3-a6da-4256-8fe8-8b8b498192a0.JPG)

</br>

<b>No.3</b>
![Kode No 3](https://user-images.githubusercontent.com/74763171/225587987-31b48062-2cf7-40ab-837f-9f8d6384b456.JPG)
<p>Program diatas adalah program untuk mencari pasangan angka pada sebuah array yang jumlahnya sama dengan target yang diberikan. Program ini menggunakan metode one-pass hash table dengan kompleksitas O(n), dimana n adalah panjang array input. Program ini terdiri dari dua method, yaitu method twoSum dan method main.</p></br>

<b>Output No.3</b>
![Output No 3](https://user-images.githubusercontent.com/74763171/225588093-b22fdcdf-adda-46c0-8a27-e6de7b7ed03e.JPG)

</br>

<b>No.4</b>
![Kode No 4](https://user-images.githubusercontent.com/74763171/225588218-e6f44af4-1654-44a8-af0e-d3230232262a.JPG)
<p>Program diatas bertujuan untuk menggabungkan dua buah array dan menghasilkan array baru yang berisi elemen unik dari array pertama yang tidak ada di array kedua.</p>

<p>Cara kerjanya adalah dengan mengubah array kedua menjadi set untuk memudahkan pencarian elemen yang sama, kemudian dilakukan iterasi pada array pertama untuk menambahkan elemen ke dalam list baru jika elemen tersebut tidak ada di dalam set. Setelah itu, list baru tersebut diubah kembali menjadi array dan di-return sebagai hasil akhir.</p>

<p>Output dari program diatas adalah [2, 4], karena elemen 2 dan 4 adalah elemen unik dari array pertama yang tidak ada di array kedua.</p></br>

<b>Output No.4</b>
![Output No 4](https://user-images.githubusercontent.com/74763171/225588314-b77fab15-121a-41a0-af0e-c67fd896f653.JPG)

</br>

<b>No.5</b>
![Kode No 5](https://user-images.githubusercontent.com/74763171/225588425-388b5636-6ccc-4655-8ef1-2e178342c101.JPG)
<p>Program di atas merupakan sebuah program untuk menghapus elemen duplikat pada array menggunakan konsep two pointers. Program menerima input berupa dua buah array, kemudian melakukan penghapusan elemen yang duplikat pada setiap array. Program kemudian mencetak panjang elemen masing-masing array setelah proses penghapusan elemen duplikat dilakukan.</p></br>


<b>Output No.5</b>
![Output No 5](https://user-images.githubusercontent.com/74763171/225588513-9df2c020-6f12-45ef-a323-21f7ce4408fe.JPG)

</br>

<b>No.6</b>
![Kode No 6](https://user-images.githubusercontent.com/74763171/225588620-def48262-62f7-44ca-b957-57393916444a.JPG)
<p>Program diatas adalah sebuah program untuk mencari subarray dengan jumlah elemen maksimum dari suatu array. Program ini menerima input array integer arr dan integer k, dimana k adalah panjang subarray yang ingin dicari. Program kemudian menghitung jumlah elemen dari k elemen pertama dari array, lalu menggeser jendela subarray sepanjang k elemen pada setiap iterasi dan menghitung kembali jumlah elemen dari subarray tersebut. Setelah menghitung jumlah elemen dari subarray pada setiap iterasi, program mencari subarray dengan jumlah elemen maksimum dan mengembalikan jumlah elemennya. Program menghasilkan output berupa jumlah elemen maksimum dari subarray pada dua contoh array arr1 dan arr2.</p></br>

<b>Output No.6</b>
![Output No 6](https://user-images.githubusercontent.com/74763171/225588701-8b6943c2-f45a-49c5-91ce-573d30039863.JPG)

</br>
