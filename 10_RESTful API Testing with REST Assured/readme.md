<h2>(9) RESTful API Testing with REST Assured</h2>


API Automation Testing With Rest Assured
API Automation Testing with Rest Assured adalah teknik pengujian perangkat lunak yang digunakan untuk menguji API 
(Application Programming Interface) secara otomatis menggunakan framework Rest Assured. 
Rest Assured adalah framework open-source yang digunakan untuk menguji layanan web RESTful.

Dalam API Automation Testing with Rest Assured, pengujian dilakukan dengan mengirimkan permintaan HTTP ke API 
dan memverifikasi respons yang diterima dari server. Framework ini menyediakan API yang mudah dipahami untuk membangun skenario pengujian. 
Rest Assured dapat digunakan dengan bahasa pemrograman Java, sehingga mudah diintegrasikan dengan proyek pengembangan perangkat lunak yang 
menggunakan bahasa tersebut.

Fundamental API Integration
Mobile App => API Server => Ext process => API Testing

Piramida Test Praktis (bawah keatas)
1. Unit Test : pengujian perangkat lunak yang menguji setiap unit atau komponen dalam perangkat lunak yang dilakukan pada masa pengembangan atau pada saat menuliskan kode program
2. Component Test : komponen pengujian perangkat lunak yang dilakukan oleh setiap individu secara terpisah tanpa mengintegrasikan dengan komponen lain.merupakan salah satu contoh black box testing yang dilakukan oleh seorang QE
3. Integrasi testing : pengujian dari hasil penggabungan unit-unit yang ada didalam software.Dilakukan scr bertahap
4. UI test : yang paling dekat dengan interaksi pengguna

BDD With Cucumber
BDD (Behavior Driven Development) adalah metodologi pengembangan perangkat lunak yang fokus pada kebutuhan bisnis dan tujuan pengguna. 
BDD berfokus pada perilaku yang diharapkan dari perangkat lunak, bukan hanya pada fungsionalitas teknis. 
Cucumber adalah framework BDD open-source yang digunakan untuk mengimplementasikan praktik BDD dalam pengembangan perangkat lunak.
1. Write Story Gherkin 
   dalah cara yang digunakan dalam BDD untuk menjelaskan perilaku yang diharapkan dari suatu aplikasi secara lebih terstruktur dan mudah dimengerti. 
   story Gherkin biasanya ditulis dalam bahasa alami dan dapat dibaca oleh semua orang, termasuk orang yang bukan ahli dalam bidang teknologi. 
   story Gherkin dibuat dalam format yang terdiri dari fitur, skenario, dan langkah-langkah pengujian.
2. Map steps to java
   langkah-langkah pengujian dalam cerita tersebut perlu dihubungkan dengan kode pengujian dalam bahasa pemrograman seperti Java. 
   Dalam hal ini, developer akan menggunakan framework Cucumber untuk membuat metode yang sesuai dengan langkah-langkah dalam cerita Gherkin 
   dan menjalankan kode pengujian dengan metode tersebut.
3. configuration stories
   Konfigurasi stories dapat dilakukan dengan cara menambahkan anotasi pada kode pengujian yang sudah dihubungkan dengan langkah-langkah dalam cerita Gherkin. 
4. Run Stories
   Setelah melakukan konfigurasi, cerita Gherkin dapat dijalankan menggunakan perintah khusus dari framework Cucumber. 
   Pengguna dapat menjalankan cerita satu per satu atau menjalankan semua cerita sekaligus
5. View Reports
   Setelah cerita Gherkin dijalankan, Cucumber akan menghasilkan laporan hasil pengujian yang dapat dilihat oleh pengguna. 
   Laporan tersebut akan menunjukkan status pengujian untuk setiap cerita dan langkah-langkah yang dilakukan dalam cerita
