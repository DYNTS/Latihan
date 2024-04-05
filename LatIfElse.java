/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DIAN
 */
public class LatIfElse {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    String keterangan,nama;
    int nilai;
    
        System.out.println("masukan nama siswa : ");
        nama = input.nextLine();
        System.out.println("masukan nilai akhir : ");
        nilai= input.nextInt();
        if(nilai > 70){
            //perintah jika kondisi true
            keterangan="lulus";
            
        }else{
            //perintah jika kondisi false
            keterangan="gagal";
        }
        System.out.println("Hasil akhir");
        System.out.println("==========================================");
        System.out.println("Nama siswa               : "+nama);
        System.out.println("Nilai Akhir yang didapat : "+nilai);
        System.out.println("Keterangan               : "+keterangan);
        System.out.println("==========================================");
        
    }
}
