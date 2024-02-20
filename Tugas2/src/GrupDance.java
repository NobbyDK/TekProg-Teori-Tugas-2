/**
 * <Tugas 2 Inheritance>
 * Author  : Nobby Dharma Khaulid
 * Program : GrupDance.java
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 19 Februari 2024
 */


public class GrupDance extends GrupMusik     //Pendefinisian subclass GrupVokal
{
    private String JenisDance; //Informasi tambahan yang terdapat pada subclass GrupDance dengan variabel Jenis Dance

    //Konstruktor untuk membuat objek GrupDance
    public GrupDance(String Nama, String Asal, int TahunBerdiri, int JumlahAnggota, String JenisDance)
    {
        super(Nama, Asal, TahunBerdiri, JumlahAnggota);      //Memanggil konstruktor superclass
        this.JenisDance = JenisDance;
    }

    //Metode untuk mendapatkan jenis dance dari objek GrupDance
    public String getJenisDance()
    {
        return JenisDance;
    }

    //Prosedur untuk menampilkan hasil inputan data GrupDance
    public void InputDataGrupVokal()
    {
        System.out.println("\t\t\t\t\t\t\t\t Hasil Inputan Data : ");
        System.out.println("=========================================================================================================================================================");
        System.out.println("Nama Grup Dance : " + getNama());
        System.out.println("Asal            : " + getAsal());
        System.out.println("Tahun Berdiri   : " + getTahunBerdiri());
        System.out.println("Jumlah Anggota  : " + getJumlahAnggota());
        System.out.println("Jenis Vokal     : " + getJenisDance());
    }
}
