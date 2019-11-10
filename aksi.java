/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusia;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class aksi {
    public static void main(String args[]) {
        String NIK, Nama, JenisKelamin;
        int Umur;
        String NIM, Fakultas, Jurusan;
        double Tugas1, Tugas2, Tugas3;
        double UTS, UAS;
        double hasil;
        
        mahasiswa MHS = new mahasiswa();
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Masukan NIK : ");
        NIK = SC.nextLine();
        System.out.print("Masukan Nama Anda: ");
        Nama = SC.nextLine();
        System.out.print("Masukan Jenis Kelamin: ");
        JenisKelamin = SC.nextLine();
        System.out.println("Masukan Umur : ");
        Umur = SC.nextInt();
        SC.nextLine();
        System.out.println("Masukan NIM : ");
        NIM = SC.nextLine();
        System.out.println("Masukan Fakultas : ");
        Fakultas = SC.nextLine();
        System.out.println("Masukan Jurusan : ");
        Jurusan = SC.nextLine();
        
        System.out.println("Masukan TGS1 : ");
        Tugas1 = SC.nextDouble();
        System.out.println("Masukan TGS2 : ");
        Tugas2 = SC.nextDouble();
        System.out.println("Masukan TGS3 : ");
        Tugas3 = SC.nextDouble();
        System.out.println("Masukan UTS : ");
        UTS = SC.nextDouble();
        System.out.println("Masukan UAS : ");
        UAS = SC.nextDouble();
        
        MHS.identitas(NIK, Nama, JenisKelamin, Umur);
        MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
        MHS.nilaiMahasiswa(Tugas1, Tugas2, Tugas3, UTS, UAS);
    }


}
