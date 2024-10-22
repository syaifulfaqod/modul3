//Ubah direktori kerja ke tempat Anda ingin menyimpan proyek
cd C:/Users/Syaiful Hidayat/.git/
//# Clone repositori ke komputer Anda
git clone <URL_repositori>
//Masuk ke direktori proyek yang telah dicloning
        cd JavaVersionControlPractice
// Buat file Java sederhana (Contoh: Main.java)
//Isi file dengan kode sederhana, misal:
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Git!");
    }
}
//Tambahkan perubahan ke indeks Git
git add Main.java
// Buat commit dengan pesan
git commit -m "Added a simple Java program"
//Dorong perubahan ke repositori jarak jauh
git push origin master

    }