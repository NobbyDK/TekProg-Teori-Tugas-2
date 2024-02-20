
/**
 * <Tugas 2 Inheritance>
 * Author  : Nobby Dharma Khaulid
 * Program : GrupMusik.java
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 19 Februari 2024
 */

abstract class GrupMusik  //Pendefinisian kelas abstrak GrupMusik
{
    // Variabel yang menyimpan informasi dasar tentang grup musik
    private String Nama;        //Nama grup musik
    private String Asal;        //Asal grup musik
    private int TahunBerdiri;   //Tahun Berdirinya grup musik
    private int JumlahAnggota;  //Jumlah anggota grup musik

     // Konstruktor untuk membuat objek GrupMusik
    public GrupMusik(String Nama, String Asal, int TahunBerdiri, int JumlahAnggota)
    {
        this.Nama = Nama;
        this.Asal = Asal;
        this.TahunBerdiri = TahunBerdiri;
        this.JumlahAnggota = JumlahAnggota;
    }

    public String getNama()     //Metode getter untuk mengembalikan nilai variabel Nama
    {
        return Nama;
    }

    public String getAsal()     //Metode getter untuk mengembalikan nilai variabel Asal
    {
        return Asal;
    }

    public int getTahunBerdiri()    //Metode getter untuk mengembalikan nilai variabel TahunBerdiri
    {
        return TahunBerdiri;
    }

    public int getJumlahAnggota()   //Metode getter untuk mengembalikan nilai variabel JumlahAnggota
    {
        return JumlahAnggota;
    }
}   




