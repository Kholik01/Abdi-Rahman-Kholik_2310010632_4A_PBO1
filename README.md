# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data rumah menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa data rumah seperti nama pemilik, tipe rumah, dan harga, lalu memberikan output berupa informasi detail dari rumah tersebut seperti luas tanah dan pajak rumah.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class Rumah { ... }

public class RumahTersedia extends Rumah { ... }

public class RumahMain { ... }


2. **Object**  adalah instance dari class. Pada kode ini, RumahTersedia[] daftarRumah = new RumahTersedia[jumlah]; diikuti dengan daftarRumah[i] = new RumahTersedia(...); adalah contoh pembuatan object.

```bash
daftarRumah[i] = new RumahTersedia(pemilik, tipe, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Contoh atribut adalah pemilik, tipe, dan harga di class Rumah.

```bash
private String pemilik;
private String tipe;
private double harga;
```

4. **Constructor** adalah method khusus yang dijalankan saat object dibuat. Pada kode ini, constructor terdapat di class Rumah dan RumahTersedia.

```bash
public Rumah(String pemilik, String tipe, double harga) {
    this.pemilik = pemilik;
    this.tipe = tipe;
    this.harga = harga;
}

public RumahTersedia(String pemilik, String tipe, double harga) {
    super(pemilik, tipe, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `this.prmilik` adalah contoh method mutator.

```bash
public void setPemilik(String pemilik) {
    this.pemilik = pemilik;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini,`getPemilik` adalah contoh method accessor.

```bash
public String getPemilik() {
    return pemilik;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `getPemilik` dan `setPemilik` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String pemilik;
// akses menggunakan getPemilik() atau setPemilik()
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Rumah` mewarisi `RumahTersedia` dengan sintaks `extends`.

```bash
public class RumahTersedia extends Rumah { ... }
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String tambahanInfo)` di `Rumah` merupakan overloading method `displayInfo()` di `RumahTersedia` merupakan override dari method `displayInfo` di `Rumah`.

```bash
public String displayInfo(String tambahanInfo) {
    return displayInfo() + "\n" + tambahanInfo;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
if(getHarga() > 100_000_000) {
    pajak = getHarga() * 0.1;
} else {
    pajak = getHarga() * 0.05;
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarRumah.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama pemilik: ");
String pemilik = input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `RumahTersedia[] daftarRumah = new RumahTersedia[jumlah];` adalah contoh penggunaan array.

```bash
RumahTersedia[] daftarRumah = new RumahTersedia[jumlah];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    jumlah = input.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Harus berupa angka!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Abdi Rahman Kholik
NPM: 2310010632
