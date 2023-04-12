<h2>(12) Fundamental Performance Testing</h2>

Performance Test adalah sebuah teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah sebagai beban (load) kerja. Performance testing mengukur kualitas atribut dan sistem seperti stabilitas, ketahanan (realibility) dan penggunaan sumber daya.
Yang diukur dari performance test
1. Performa suaru aplikasi sampai suatu batas tertentu
2. bukan merupakan functional test
bisa dalam berbagai macam bentuk untuk memahami realibilty, stability dan availability pada environment
yang perlu diperhatikan dari performance test adalah throughput dan response data
langkah yang harus dilakukan dalam memecahkan kasus performance test
1. Membuat test plan
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test

Tipe Performance Test ada 4 yaitu 
1. Endurance test atau smoke testing adalah sebuah pengujian yang dilakukan untuk verify script yang telah dibuat 
2. Load test adlah sebuah pengujian pada suatu fitur yang dilakukan dengan memberikan beban kerja tertentu.
3. Stress test adalah sebuah test yang digunakan untuk mengamati sebuah kemampuan sistem ketika kondisinya ekstream namun bertahap
4. spike test yaitu hampir sama dengan stress namun mengalami kenaikan langsung melebihi puncak dilakukan dalam waktu singkat
5. Soak test yaitu memberikan beban kerja yang cukup banyak dalam waktu yang panjang

Introduction JMeter and Tutorial Record with JMeter

Apache Jmeter adalah perangkat lunak terbuka, aplikasi dekstop java 100% untuk memuat uji perilaku fungsional dan mengukur kinerja situs web.

Beberapa component JMeter script
1. Test plan : rencana besar test yang akan dilakukan (parent)
2. Thread Groups : kumpulan thread yang menjalankan skenario yang sama
3. Samplers : sebutan untuk request yang dikirim ke server
4. Config elements : Elemen yang digunakan untuk konfigurasi atau modifikasi sampler request yang dikirim ke server
5. Listener : Perekam data yang dihasilkan dari tes
6. Timers : Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan
7. Assertions : seperti asserts pada API/Web/testing merupakan kriteria tambahan apakah pass/tidak
8. Pre-post processors : Fitur yang memproses response data sebelum/sesudah tes



<h2>(12) Introduction & Tutorial Record with JMeter</h2>

Beberapa tools yang digunakan untuk melakukan performa test yaitu, apache jmeter, k6, locust, BlazerMaster, dan smartbear LoadNinja. Pada materi ini pembelajaran difokuskan pada apache jmeter. apache jmeter adalah perangkat lunak sumber terbuka, aplikasi desktop java 100% murni, yang dirancang untuk memuat uji perilaku funggsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya. Jmeter ini digunakan secara open source dan easy to use with GUI/Non GUI. Untuk membuka Jmeter yakni membuka terminal kemudian menuju ke folder bin lalu run file jmeter dengan format batch file. Beberapa komponen pada script jmeter adalah test plan(rencana besar tes yang akan dilakukan), thread groups(kumpulan thread yang menjalankan skenario yang sama), sampler(sebutan untuk request yang dikirim ke server), config elements(elemen yang digunakan untuk konfigurasi/modifikasi sampler request yang dikirim ke server),  listener(perekam data yang dihasilkan dari test), timer().Untuk recording test pertama kita yakni 


<h2>(12) Post Processor & Understanding JMeter Result</h2>

