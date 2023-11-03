# PA-Capstone-23

Tema Project Akhir : Data Kunjungan Lapas 
# Deskripsi Tema
Tema "Daftar Kunjungan Lembaga Pemasyarakatan (Lapas) Java" adalah sebuah aplikasi atau sistem yang dirancang untuk mencatat dan melacak data kunjungan di sebuah lembaga pemasyarakatan. Aplikasi ini memiliki beberapa komponen penting yang memungkinkan pengguna, pengunjung, dan narapidana, untuk memanfaatkan berbagai fitur yang ada. B
## 1) Package model
Package ini terdiri dari 4 file:
a. Kunjungan
 - mendeklarasi package di mana kelas Kunjungan berada.
 ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/05671aec-6baa-498c-8025-ccf9b729c4eb)

 - import ini untuk mengimpor kelas database dari package Databases. Ini menyatakan bahwa kelas Kunjungan akan menggunakan kelas database yang ada di dalam paket 
   Databases.
 ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/429ac23c-b306-475e-9e4d-2707dd1641b5)

- mendeklarasikan kelas Kunjungan yang meng-extends kelas database.
![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/bd217937-4295-439e-b9ec-852a35902d69)

- atribut-atribut yang akan digunakan dalam kelas Kunjungan untuk merepresentasikan data kunjungan. Mereka memiliki tipe data yang berbeda seperti int dan String dan 
  memiliki nama yang sesuai dengan data yang akan mereka simpan, seperti idKunjungan untuk ID kunjungan, tanggal untuk tanggal kunjungan, dan sebagainya.
![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/ec4d50e4-abab-4a04-bb6a-a907ce0fcbe1)
b. Narapidana
  - mendeklarasi package di mana kelas Narapidana berada.
  ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/f41ecdcb-cd36-4686-8777-9cdbce2ad21e)

  - import ini untuk mengimpor kelas database dari package Databases. Ini menyatakan bahwa kelas Kunjungan akan menggunakan kelas database yang ada di dalam paket 
    Databases.
  ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/d2768350-c94e-4fa9-a41e-74c5797cf2d8)

  - mendeklarasikan kelas Narapidana yang meng-extends kelas database.
  ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/5bde79a9-7b72-4f32-bbfd-4386ad16b195)

  - atribut-atribut yang akan digunakan dalam kelas Narapidana untuk merepresentasikan informasi tentang narapidana. Mereka memiliki tipe data yang berbeda seperti int 
    dan String dan memiliki nama yang sesuai dengan informasi yang akan mereka simpan, seperti idNapi untuk ID narapidana, namaNapi untuk nama narapidana, dan 
    sebagainya.
  ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/32bc6c4a-e12c-413c-b953-1513a35c218a)

c. Pengunjung
 - mendeklarasi package di mana kelas Pengunjung berada.
 ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/968323ea-6a3f-4797-9e20-e3b48897bdb6)

 -  import ini untuk mengimpor kelas database dari package Databases. Ini menyatakan bahwa kelas Pengunjung akan menggunakan kelas database yang ada di dalam paket 
    Databases.
 ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/4b1ad25f-4dfd-4122-b9a4-de04941fbb36)

 - mendeklarasikan kelas Pengunjung yang meng-extends kelas database.
 ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/1d65a148-25b4-400a-bc32-815e0eb744e9)

 - Atribut idPengunjung memiliki kata kunci static yang berarti atribut ini terkait dengan kelas secara keseluruhan. Ini digunakan untuk mengidentifikasi pengunjung secara 
   unik, dan nilainya dapat diakses dan diubah tanpa membuat objek kelas Pengunjung.
 ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/e45f7bd9-62d4-441e-946d-4d1000c985ad)
# 2) Package Interface
Pada package ini terdapat 4 file gui yaitu DaftarKunjungan, Login, MenuAdmin, dan Registrasi.
1. Daftar Kunjungan
   ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/5ba261f9-c079-40c2-a10a-aa18ec8d6fa1)

2. Login
   ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/d8052043-411b-4678-815e-481727876c4f)

3. MenuAdmin
   ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/f15ef3b0-1d79-4b69-b26b-32f074625724)

4. Registrasi
   ![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/117e432c-0908-41ff-b19d-c5eb26f2e189)

# 2) Package Databases
Pada package ini terdapat file java bernama database yang berisi construcutor yang digunakan untuk menghubungkan ke database.

# 3) Package DataAccessObject
Package ini berisi constructor yang digunakan pada setiap package model, file pada package ini berisi KunjunganDAO, NarapidanaDAO, PengunjungDAO, dan StafDAO.
## Hierarki
![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/ba48b58b-ba20-4fd5-91b8-306e3b950b9b)
## Flowchart
![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/705db1fc-3541-488b-a295-56be6bc780e1)
![image](https://github.com/PA-Capstone-23/PA-Capstone-23/assets/122289679/0be768c3-7216-4b16-9212-9fc0a7a5bd28)













