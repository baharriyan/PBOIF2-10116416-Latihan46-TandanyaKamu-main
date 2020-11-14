package Human;
/**
 * @author
 * Nama  : RIYAN BAHAR
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : Program meramal umur
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";
    
    public void Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        String pesan = "";
        
        if(0 <= umur && umur <= 5) {
            pesan = "LAGI LUCU-LUCUNYA";
        }
        else if(5 < umur && umur <= 10) {
            pesan = "MASIH ANAK-ANAK";
        }
        else if(10 < umur && umur <= 13) {
            pesan = "MASIH REMADJA";
        }
        else if(13 < umur && umur <= 19) {
            pesan = "ALAY";
        }
        else if(19 < umur && umur <= 29) {
            pesan = "LAGI GALAU NYARI JODOH";
        }
        else if(29 < umur && umur <= 35) {
            pesan = "LAGI SIBUK NYARI UANG";
        }
        else if(35 < umur && umur <= 150) {
            pesan = "SUDAH TUA";
        }
        else{
            pesan = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        return red + pesan;
    }
    
    
}
