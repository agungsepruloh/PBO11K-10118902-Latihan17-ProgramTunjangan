package com.pbo;

import java.util.Scanner;

/*
 * # Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 * Program description: this program will calculates your salary and allowance base on your marriage status
 *
 */

public class Tunjangan {

    public static void main(String[] args) {
        System.out.println("========== Program Tunjangan ==========");
        System.out.print("Berapa gaji pokok Anda perbulan?: Rp ");
        Scanner scanner = new Scanner(System.in);
        int gapok = scanner.nextInt();

        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        Scanner scanner1 = new Scanner(System.in);
        String status = scanner1.next().toUpperCase();
        int tunjangan = ((status.equals("MENIKAH") ? gapok * 35 / 100: 0));

        System.out.println("\n==== Hasil Perhitungan Gaji Anda ====");
        System.out.println("Gaji Anda\t\t: Rp " + gapok);
        System.out.println("Tunjangan\t\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp " + (gapok + tunjangan));
    }
}
