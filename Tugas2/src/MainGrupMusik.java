import java.util.Scanner;

/**
 * <Tugas 2 Inheritance>
 * Author  : Nobby Dharma Khaulid
 * Program : MainGrupMusik.java
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 19 Februari 2024
 */

public class MainGrupMusik {        
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        //Menginput Data untuk grup vokal
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t Silahkan Inputkan Data Dibawah : ");
        System.out.println("=========================================================================================================================================================");
        System.out.print("Nama Grup Vokal : ");
        String Nama1 = Input.nextLine();
        System.out.print("Asal            : ");
        String Asal1 = Input.nextLine();
        System.out.print("Tahun Berdiri   : ");
        int TahunBerdiri1 = Input.nextInt();
        System.out.print("Jumlah Anggota  : ");
        int JumlahAnggota1 = Input.nextInt();
        System.out.print("Jenis Vokal     : ");
        Input.nextLine();       //Supaya dapat mengakses inputan selanjutnya
        String JenisVokal = Input.nextLine();
        System.out.println("\n");
        
        //Membuat objek GrupVokal dan memasukkan data
        GrupVokal Vokal = new GrupVokal(Nama1, Asal1, TahunBerdiri1,JumlahAnggota1, JenisVokal);
        Vokal.InputDataGrupVokal();

        //Menginput Data untuk grup dance
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t Silahkan Inputkan Data Dibawah : ");
        System.out.println("=========================================================================================================================================================");
        System.out.print("Nama Grup Dance : ");
        String Nama2 = Input.nextLine();
        System.out.print("Asal            : ");
        String Asal2 = Input.nextLine();
        System.out.print("Tahun Berdiri   : ");
        int TahunBerdiri2 = Input.nextInt();
        System.out.print("Jumlah Anggota  : ");
        int JumlahAnggota2 = Input.nextInt();
        System.out.print("Jenis Dance     : ");
        Input.nextLine();       //Supaya dapat mengakses inputan selanjutnya
        String JenisDance = Input.nextLine();
        System.out.println("\n");

        //Membuat objek GrupDance dan memasukkan data
        GrupDance Dance = new GrupDance(Nama2, Asal2, TahunBerdiri2, JumlahAnggota2, JenisDance);
        Dance.InputDataGrupVokal();

        //Menginput Data untuk grup band
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t Silahkan Inputkan Data Dibawah : ");
        System.out.println("=========================================================================================================================================================");
        System.out.print("Nama Grup Band  : ");
        String Nama3 = Input.nextLine();
        System.out.print("Asal            : ");
        String Asal3 = Input.nextLine();
        System.out.print("Tahun Berdiri   : ");
        int TahunBerdiri3 = Input.nextInt();
        System.out.print("Jumlah Anggota  : ");
        int JumlahAnggota3 = Input.nextInt();
        System.out.print("Genre           : ");
        Input.nextLine();       //Supaya dapat mengakses inputan selanjutnya
        String Genre = Input.nextLine();
        System.out.println("\n");

        //Membuat objek GrupBand dan memasukkan data
        GrupBand Band = new GrupBand(Nama3, Asal3, TahunBerdiri3, JumlahAnggota3, Genre);
        Band.InputDataGrupBand();
        Input.close();
    }
}


