/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Nilai {
    private String nim;
    private String nama;
    private double nilaiAbsen;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiAkhir;

    // Konstruktor
    public Nilai() {
        this.nim = "8470697710799";
        this.nama = "Yuri";
        this.nilaiAbsen = 90.0;
        this.nilaiTugas = 85.0;
        this.nilaiUTS = 75.0;
        this.nilaiUAS = 76.0;
        this.nilaiAkhir = 79.0;
    }

    // Metode untuk mencetak nilai
    public void CetakNilai() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Nilai Absen[10%]: " + String.format("%.6f", nilaiAbsen));
        System.out.println("Nilai Tugas[20%]: " + String.format("%.6f", nilaiTugas));
        System.out.println("Nilai UTS[30%] : " + String.format("%.6f", nilaiUTS));
        System.out.println("Nilai UAS[40%] : " + String.format("%.6f", nilaiUAS));
        System.out.println("Nilai Akhir    : " + String.format("%.6f", nilaiAkhir));
    }
}
