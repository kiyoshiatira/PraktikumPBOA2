/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

public class Mahasiswa { // [cite: 169]
    // Atribut sesuai kolom di database [cite: 165, 170]
    private int id; // [cite: 171]
    private String nama; // [cite: 172]

    // Constructor Tanpa Parameter [cite: 173, 174]
    public Mahasiswa() {
    }

    // Constructor Dengan Parameter [cite: 175]
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter [cite: 167, 176]
    public int getId() { // [cite: 177]
        return id;
    }

    public void setId(int id) { // [cite: 178]
        this.id = id;
    }

    public String getNama() { // [cite: 179]
        return nama;
    }

    public void setNama(String nama) { // [cite: 180]
        this.nama = nama;
    }

    // Mengubah objek menjadi string saat dicetak [cite: 181, 182]
    @Override
    public String toString() {
        return "Mahasiswa {id=" + id + ", nama=" + nama + "}"; // [cite: 184]
    }
}