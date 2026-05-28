/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

/**
 *
 * @author kiyos
 */


import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

public class Program { // [cite: 213]
    static MysqlMahasiswaService service = new MysqlMahasiswaService(); // [cite: 214]

    public static void main(String[] args) { // [cite: 214]
        // 1. Aksi INSERT [cite: 216]
        System.out.println("=== insert ==="); // [cite: 217, 239]
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo"); // [cite: 221]
        service.add(mhsAdd); // [cite: 222]
        System.out.println("berhasil insert: " + mhsAdd); // [cite: 223, 241]
        displayAll(); // [cite: 223]

        // 2. Aksi UPDATE [cite: 224]
        System.out.println("\n=== update ==="); // [cite: 225, 248]
        Mahasiswa mhsUpdate = service.getById(5); // [cite: 226, 227]
        System.out.println("Akan diupdate data lama: " + mhsUpdate); // [cite: 228, 249]
        
        if (mhsUpdate != null) {
            mhsUpdate.setNama("Dinaya"); // [cite: 229]
            System.out.println("dengan data baru: " + mhsUpdate); // [cite: 230, 250]
            service.update(mhsUpdate); // [cite: 231]
            displayAll(); // [cite: 232]
        }

        // 3. Aksi DELETE [cite: 233]
        System.out.println("\n=== delete ==="); // [cite: 234, 258]
        System.out.println("akan di delete: " + service.getById(5)); // [cite: 236, 259]
        service.delete(5); // [cite: 236]
        displayAll(); // [cite: 237]
    }

    // Method pembantu untuk menampilkan semua isi tabel [cite: 223, 232, 237]
    public static void displayAll() {
        System.out.println("=== displayAll ==="); // [cite: 242, 252, 261]
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}
