package com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Latihan6 {
    public static void main(String[] args) throws IOException {
        String nama;
        int umur;
        // Membuat objek imputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek bufferendreadeer
        BufferedReader br = new BufferedReader(isr);
        // Mengisi variabel nama dengan BufferedReader
        System.out.print( "input nama anda : ");
        nama = br.readLine();
        System.out.print("Inputkan umur anda : ");
        umur =Integer.parseInt(br.readLine());
        //Tampilkan output isi variabel nama
        System.out.println("Nama anda adalah " + nama);
        System.out.println("umur " + umur);
    }

    }

