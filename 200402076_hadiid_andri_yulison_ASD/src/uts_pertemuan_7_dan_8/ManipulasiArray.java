/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pertemuan_7_dan_8;
import java.util.Scanner;
/**
 *
 * @author HADIID ANDRI YULISON
 */
public class ManipulasiArray {
    public static void main(String[] args){
        String kotaX = "";      // Kota yang akan dihapus
                                // atau ditambahkan
                                
        ArrayData kota = new ArrayData(); // Buat objek
        
        // Sisipkan 3 kota. Pastikan kota dalam keadaan urut
        kota.tambahData("Medan");
        kota.tambahData("Pekanbaru");
        kota.tambahData("Jakarta");
        kota.tampilkanData();
        
        // Proses interaksi dengan pemakai
        Scanner kbd = new Scanner(System.in);
        char pilihan;
        
        do{
            pilihan = kota.pilihMenu();
            switch (pilihan){
                case '1' : {
                    System.out.print("Penambahan data.\nKota: ");
                    kotaX = kbd.nextLine();
                    if(!kota.tambahData(kotaX)){
                        System.out.println("Gagal menambah data. Wadah penuh");
                    }
                    break;
                }
                case '2' : {
                    System.out.print("Penghapusan data.\nKota: ");
                    kotaX = kbd.nextLine();
                    if(!kota.hapusData(kotaX)){
                        System.out.println("Gagal menambah data. Wadah penuh");    
                    }
                    break;
                }
                case '3' : {
                    kota.tampilkanData();
                    break;
                }
                case '4' : {
                    System.out.println("* Selesai");   
                }
            }
        }
        while (pilihan != '4');
        
        kbd.close(); // Akhiri pembacaan data
    }
}     // 
class ArrayData {
    final int MAKSDATA = 10;
    private final String[] kota = new String[10];  
    private int jumKota;
    // Konstruktor
    public ArrayData(){
        jumKota = 0;
    }
    // Pilih tindakan pada menu
    public char pilihMenu(){
        char pilihan;
        Scanner kbd = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus data");
            System.out.println("3. Tampilkan data:");
            System.out.println("4. Selesai");
            System.out.print("Pilihan (1, 2, 3, atau 4 dan tekan Enter): ");
            String baris = kbd.nextLine();
            if(baris.isEmpty()){
                pilihan = '0';
            }
            else{
                pilihan = baris.charAt(0);
            }
        }
        while(pilihan < '1' || pilihan > '4');
        return pilihan;
    }
    // Menampilkan isi array
        public void tampilkanData(){
            System.out.println("Isi array: ");
            for (int j = 0; j<jumKota; j++){
                System.out.print(kota[j]);
                if (j != (jumKota-1)){
                    System.out.print(" - "); // Beri pemisah antarkota
                }
            }
            System.out.println(); // Pindah baris
        }
    // Menambah data
        public boolean tambahData(String kotaBaru) {
            if(jumKota == MAKSDATA){
                System.out.println( "Array sudah penuh" );
                return false;       // Gagal menambah kota
            }
            // Cari posisi penyisipan
            int posisi = -1;
            for (int j = 0; j < jumKota; j++){
                if (kotaBaru.compareTo(kota[j]) < 0){
                    posisi = j;
                    break;
                }
            }
            if (posisi == -1){
                // Sisipkan di belakang
                    kota[jumKota] = kotaBaru;
                    jumKota = jumKota + 1;
            }
            else { // Kalau posisi tidak sama dengan -1
                    // Sisipkan pada posisi
                // a. Geser dulu
                for (int j= jumKota-1; j>= posisi; j--){
                    kota[j + 1] = kota[j];
                }
                // b. Sisipkan
                kota[posisi] = kotaBaru;
                jumKota = jumKota + 1;
            }
            return true;
        }
    // Menghapus data
        public boolean hapusData(String kotaX){
            // Cari posisi penghapusan
            int posisi = -1;
            for (int j = 0; j <jumKota; j++){
                if(kotaX.compareTo(kota[j]) == 0){ // Kalau sama
                    posisi = j;
                    break;
                }
            }
            
        // Kalau tidak ditemukan
            if (posisi == -1){
                return false; // Gagal menghapus karena data tidak ada
            }
            
        // Penghapusan kota
            if(posisi == (jumKota-1)){
                // Hapus di bagian akhir
                jumKota = jumKota - 1;
            }
            else{ // Kalau posisi tidak sama
                  // dengan yang terakhir
                  
                // Geser ke atas untuk menghapus
                for (int j = posisi+1; j < jumKota; j++){
                    kota[j - 1] = kota[j];
                    jumKota = jumKota - 1;
                }
            }
            return true;
        }
} 















