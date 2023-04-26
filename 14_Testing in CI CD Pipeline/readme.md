<h2>(14) Testing in CI/CD Pipeline</h2>

CI (Continuous Integration) adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis, sedini mungkin-biasanya beberapa kali sehari
CD (Continuous Delivery/Deployment) menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan mendorong perubahan secara otomatis ke sistem pementasan.

Continuous Delivery
1.Menyiapkan dan melacak rilis ke produksi secara otomatis
2.Hasil yang diinginkan adalah siapa pun dengan hak istimewa yang memadai untuk menerapkan rilis baru dapat melakukannya kapan saja dengan satu atau beberapa klik.
Continuous Deployment
1.Setiap perubahan dalam kode sumber diterapkan ke produksi secara otomatis tanpa persetujuan eksplisit dari pengembang.
2.Lolos quality control

CI yang baik :
A. Tahapan yang dipisahkan
setiap langkah dalam CI harus melakukan tugas terfokus tunggal
B. Berulang
- mengotomatiskan dengan cara yang dapat diulang secara konsisten
- perkakas harus bekerja untuk pengembang lokal juga
C. gagal dengan cepat
D. Desain dengan mempertimbangkan sistem
mencakup sebanyak mungkin bagian penerapan, seperti: aplikasi, infrastruktur, konfigurasi, data
e. saluran pipa
F. Versi Unik Secara Global
- mengetahui keadaan sistem setiap saat
- Mampu menunjukkan perbedaan antara keadaan saat ini dan masa depan

Tahapan CI
Commit => Build => Test => Deploy

Tahapan Continuous Integration (CI) biasanya meliputi langkah-langkah seperti:
a. Integrasi kode: menggabungkan kode dari beberapa pengembang ke dalam satu repositori utama.
b. Build: mengompilasi kode menjadi aplikasi yang dapat dijalankan.
c. Testing: menjalankan otomatisasi tes untuk memastikan bahwa kode berfungsi dengan baik.
d. Deploy to Staging: menyebarkan aplikasi ke server pengujian (staging) untuk pengujian lebih lanjut.
e. Acceptance Test: menguji aplikasi di lingkungan staging untuk memastikan bahwa aplikasi berfungsi sebagaimana mestinya.
f. Deploy to Production: menyebarkan aplikasi ke server produksi setelah melewati semua tes dan memperoleh persetujuan dari tim yang terkait.

Manfaat CI
1. Mendeteksi bug di tahap awal
2. Mengurangi jumlah bug
3. Proses penerapan lebih transparan
4. Efisien

Manfaat CD
1. Kurangi risiko
2. Penyebaran tanpa rasa sakit
3. Mengurangi biaya
4. Proses otomatis dan transparan
5. Rilis lebih sering

Continuous Integration costs : write automated test, server for automated test, merge the code as often possible
Continuous Deployment costs : strong foundations in CI, Need highest quality of thest, documentation need to be updated frequently

Tools CI/CD : Jenkins, bamboo, circleci,AWS CodeBuild, Azure DevOps, CI/CD, Travis CI, Github Actions