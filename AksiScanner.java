/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DIAN
 */
public class AksiScanner {
   public static void main(String args[]) 

{
//membuat objek baru
ClassScanner scan=new ClassScanner();

scan.inputScanner();
System.out.print("\nNama Anda :" + scan.getnama());
System.out.print("Nilai Anda :" + scan.rata());
}
}