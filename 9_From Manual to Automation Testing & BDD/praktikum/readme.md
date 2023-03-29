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
![path](screenshoots/prioritas 1.jpg)
</br>
</br>
2. Soal Prioritas 2
Hasil: 

![path](screenshoots/prioritas 2.jpg) 

</br>
</br>
3. Soal Eksplorasi
<ul>
<li>Kode cypress login case:</li>

![path](screenshoots/cypress login case.jpg)
</br>
</br>

<li>Kode cypress login js:</li>

![path](screenshoots/cypress loginjs.jpg)
</br>
</br>

<li>Hasil cypress login feature:</li>

![path](screenshoots/cypress login feature.jpg)
</br>
</br>

<li>Kode cypress payment case:</li>

![path](screenshoots/cypress payment case.jpg)
</br>
</br>

<li>Kode cypress payment js:</li>

![path](screenshoots/cypress paymenjs.jpg)
</br>
</br>

<li>Hasil cypress payment feature:</li>

![path](screenshoots/cypress payment feature.jpg)
</br>
</br>

<li>Kode cypress product case:</li>

![path](screenshoots/cypress product case.jpg)
</br>
</br>

<li>Kode cypress product js:</li>

![path](screenshoots/cypress productjs.jpg)
</br>
</br>

<li>Hasil cypress product feature:</li>

![path](screenshoots/cypress product feature.jpg)
</br>
</br>

<li>Hasil cypress response terminal :</li>

![path](screenshoots/cypress response terminal.jpg)
</br>
</br>

<li>Hasil cypress all feature :</li>

![path](screenshoots/cypress all feature.jpg)
</br>
</br>
</ul>



