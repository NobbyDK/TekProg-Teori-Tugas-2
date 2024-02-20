/**
 * <Tugas 2 Inheritance>
 * Author  : Nobby Dharma Khaulid
 * Program : GrupBand.java
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 19 Februari 2024
 */


 public class GrupBand extends GrupMusik    //Pendefinisian subclass GrupVokal
 {
     private String Genre;  //Informasi tambahan yang terdapat pada subclass GrupBand dengan variabel Genre

     //Konstruktor untuk membuat objek GrupBand
     public GrupBand(String Nama, String Asal, int TahunBerdiri, int JumlahAnggota, String Genre)
     {
         super(Nama, Asal, TahunBerdiri, JumlahAnggota);    //Memanggil konstruktor superclass
         this.Genre = Genre;
     }

   //Metode untuk mendapatkan Genre dari objek GrupBand
     public String getGenre()
     {
         return Genre;
     }

     //Prosedur untuk menampilkan hasil inputan data GrupBand
     public void InputDataGrupBand()
     {
         System.out.println("\t\t\t\t\t\t\t\t Hasil Inputan Data : ");
         System.out.println("=========================================================================================================================================================");
         System.out.println("Nama Grup Band  : " + getNama());
         System.out.println("Asal            : " + getAsal());
         System.out.println("Tahun Berdiri   : " + getTahunBerdiri());
         System.out.println("Jumlah Anggota  : " + getJumlahAnggota());
         System.out.println("Genre           : " + Genre);
     }
 }
 