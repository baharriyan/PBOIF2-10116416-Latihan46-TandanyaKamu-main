package pboif2.pkg10116416.latihan46.tandanyakamu;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program meramal umur
 */
import java.util.Scanner;
import Human.Age;
import java.util.Calendar;
public class PBOIF210116416Latihan46TandanyaKamu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Age umur = new Age();
        
        System.out.printf("Masukkan Tahun Lahir Anda : ");umur.setYearBirth(scan.nextInt());
        
        System.out.printf("\n======Hasil Perhitungan Umur======\n");
        System.out.printf("Tahun lahir anda : %d\n",umur.getYearBirth());
        umur.Age(Calendar.getInstance().get(Calendar.YEAR));
        System.out.printf("Hari ini tahun : %d\n",umur.getYearNow());
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun\n", umur.hitungUmur());
        System.out.printf("Tandanya Kamu %s\n", umur.tandanyaKamu(umur.hitungUmur()));
        
        
    }
    
}
