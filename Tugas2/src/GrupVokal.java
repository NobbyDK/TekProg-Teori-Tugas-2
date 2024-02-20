/**
 * <Tugas 2 Inheritance>
 * Author  : Nobby Dharma Khaulid
 * Program : GrupVokal.java
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 19 Februari 2024
 */


public class GrupVokal extends GrupMusik    //Pendefinisian subclass GrupVokal
{
    private String JenisVokal;  //Informasi tambahan yang terdapat pada subclass GrupVokal dengan variabel JenisVokal

     //Konstruktor untuk membuat objek GrupVokal
    public GrupVokal(String Nama, String Asal, int TahunBerdiri, int JumlahAnggota, String JenisVokal)
    {
        super(Nama, Asal, TahunBerdiri, JumlahAnggota);     //Memanggil konstruktor superclass
        this.JenisVokal = JenisVokal;      
    }

    //Metode untuk mendapatkan jenis vokal dari objek GrupVokal
    public String getJenisVokal()
    {
        return JenisVokal;
    }

     //Prosedur untuk menampilkan hasil inputan data GrupVokal.
    public void InputDataGrupVokal()
    {
        System.out.println("\t\t\t\t\t\t\t\t Hasil Inputan Data : ");
        System.out.println("=========================================================================================================================================================");
        System.out.println("Nama Grup Vokal : " + getNama());
        System.out.println("Asal            : " + getAsal());
        System.out.println("Tahun Berdiri   : " + getTahunBerdiri());
        System.out.println("Jumlah Anggota  : " + getJumlahAnggota());
        System.out.println("Jenis Vokal     : " + getJenisVokal());
    }
}
