<h2>Soal & Jawaban From Manual to Automation Testing</h2>

1. Jelaskan jenis-jenis dari performance testing (minimal: 3).
Jawab   : Jenis - Jenis Performance Test
Ada berbagai macam performance testing. Hal ini dibedakan berdasarkan goal dan cara melakukan testnya. Mari kita bahas satu per satu. discalimer: setiap organisasi mungkin memiliki istilah yang berbeda. Namun, pada dasarnya definisinya sama.
<b></b>
<b>Load Testing</b>
Jenis tes ini akan dilakukan dengan menentukan target load. Biasanya digunakan untuk persiapan menghadapi sebuah event musiman yang trafiknya bertambah seiring waktu. Contohnya sistem kita kan melakukan penjualan mudik lebaran. Tentunya semakin mendekati waktu lebaran, maka ekpektasinya sistem akan menerima trafik yang lebih banyak. Jadi, dengan melakukan load testing kita akan mengatahui apakah sistem kita sanggup handle trafik sesuai ekspektasi kita.

Load testing biasanya dilakukan dengan scalability testing juga, yaitu menaikkan load perlahan - lahan pada setiap skenarionya, kemudian memonitor penggunaan resourcenya apakah ada perbedaan yang signifikan atau tidak. Contohnya: penggunaan CPU dan memory atau melihat bagaimana behaviour sistem ketika scale up atau scale down apakah telat atau terlalu cepat melakukan scaling.

<b>Spike Testing</b>
Load dan spike testing adalah hal yang mirip, keduanya bertujuan untuk mengetahui apakah sistem mampu handle trafik sesuai ekspektasi. Bedanya, sesuai namanya, spike testing dilakukan dengan mengirim load secara mendadak dalam waktu yang bersamaan. Contoh case yang bisa digunakan adalah event pengisian KRS di kampus atau pendaftaran penerimaan CPNS dimana trafik yang datang akan cenderung mendadak pada tanggal dan waktu yang sama.

<b>Stress Testing</b>
Saya lebih suka menyebutnya capacity testing, yaitu melakukan tes dengan load diluar ekspektasi hingga sistem tidak mampu lagi handle trafiknya. Tujuannya jelas, untuk mengetahui kapasitas sistem yang sedang berjalan.

<b>Soak Testing</b>
Saya lebih suka menyebutnya endurance testing dimana kita akan melakukan tes dengan load yang normal, namun dalam waktu yang panjang. Tujuannya untuk melakukan analisa dan evaluasi behaviour sistem kita. Biasanya digunakan untuk mengetahui apakah sistem akan mengalami memory leaks pada penggunaan jangka panjang. Apa itu memory leaks  dan  bagaimana impact terhadap performa? Kita akan membahas pada artikel terpisah.

4 jenis tes diatas adalah tes yang paling umum dilakukan. Namun, ada beberapa jenis tes lain yang biasa saya lakukan dan penting juga, volumne testing.

<b>Volume Testing</b>
Tes ini dilakukan untuk melihat bagaimana behaviour sistem ketika memiliki data yang sangat besar. Biasanya tes dilukan bertahap dimulai dari jumlah data yang masih sedikit di database, kemudian akan kita tambah terus menerus datanya sampai jumlahnya sangat besar. Tujuannya tidak lain untuk kesiapan sistem secara long term. Dimana semakin lama sistem digunakan, biasanya akan semakin besar data yang disimpan. Contohnya: data transaksi  yang memang harus disimpan terus sebagai rekap.


2. Sebutkan dan jelaskan tools yang dapat digunakan untuk melakukan performance testing (minimal: 3).
Jawab : 
a. JMeter: tool open-source yang dapat digunakan untuk melakukan load testing pada aplikasi web, FTP, database, dan lainnya.
b. LoadRunner: tool yang dapat digunakan untuk melakukan load testing pada aplikasi web dan mobile, serta dapat menguji kinerja server dan jaringan.
c. Gatling: tool open-source yang dapat digunakan untuk melakukan load testing pada aplikasi web, yang terkenal dengan kemampuan simulasi user yang realistis.
</br>


<h2>BDD hasil run kode</h2>

1. Soal Prioritas 1
Hasil:
![prioritas 1](https://user-images.githubusercontent.com/74763171/228563101-98d15d0f-ce89-41fb-98de-60574355b204.JPG)

</br>
</br>
2. Soal Prioritas 2
Hasil: 
![prioritas 2](https://user-images.githubusercontent.com/74763171/228563248-dc23d926-4ab3-4d6a-b05b-ba7c3830dc4b.JPG)

</br>
</br>
3. Soal Eksplorasi
<ul>
<li>Kode cypress login case:</li>
![cypress login case](https://user-images.githubusercontent.com/74763171/228563424-b70d3d77-aa02-46a8-b67f-1de05e139f5a.JPG)

</br>
</br>

<li>Kode cypress login js:</li>
![cypress loginjs](https://user-images.githubusercontent.com/74763171/228563586-1dadac5e-27a9-4892-b9be-994721c7cd1a.JPG)

</br>
</br>

<li>Hasil cypress login feature:</li>
![cypress login feature](https://user-images.githubusercontent.com/74763171/228563741-b285a43a-c340-44f9-9e59-28d44b1b497a.JPG)

</br>
</br>

<li>Kode cypress payment case:</li>
![cypress payment case](https://user-images.githubusercontent.com/74763171/228563892-73f097df-e3d9-4e91-9e9c-af32ae409c14.JPG)

</br>
</br>

<li>Kode cypress payment js:</li>
![cypress paymenjs](https://user-images.githubusercontent.com/74763171/228564024-ea671dfe-0908-48fc-8903-f656891f8d22.JPG)

</br>
</br>

<li>Hasil cypress payment feature:</li>
![cypress payment feature](https://user-images.githubusercontent.com/74763171/228564306-ef35ca63-83bd-45e1-a95d-b038bc638da9.JPG)

</br>
</br>

<li>Kode cypress product case:</li>
![cypress product case](https://user-images.githubusercontent.com/74763171/228564432-767f3ca0-66a8-4da4-b1b1-98467f350bae.JPG)

</br>
</br>

<li>Kode cypress product js:</li>
![cypress productjs](https://user-images.githubusercontent.com/74763171/228564592-0bbb6682-8d4b-49cd-9359-767d71ce4f07.JPG)

</br>
</br>

<li>Hasil cypress product feature:</li>
![cypress product feature](https://user-images.githubusercontent.com/74763171/228564763-28b6c7e3-f1e0-4924-8615-21710ddd7a83.JPG)

</br>
</br>

<li>Hasil cypress response terminal :</li>
![cypress response terminal](https://user-images.githubusercontent.com/74763171/228564902-da03d819-e5a5-47cc-aa12-243ad174cd52.JPG)

</br>
</br>

<li>Hasil cypress all feature :</li>
![cypress all feature](https://user-images.githubusercontent.com/74763171/228565157-4e3680ec-7e77-4c3c-bed1-50ce03f59de3.JPG)

</br>
</br>
</ul>



