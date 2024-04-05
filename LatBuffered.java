/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
/**
 *
 * @author DIAN
 */
public class LatBuffered {
    public static void main(String args[])throws Exception
    
{  
//membuat objek baru
InputStreamReader keyreader = new InputStreamReader (System.in);
BufferedReader input = new BufferedReader (keyreader);
//deklarasi variable
String kata1, kata2;

System.out.print("masukan kata pertama : ");
kata1 = input.readLine();
System.out.print("masukan kata kedua : ");
kata2 = input.readLine();
System.out.println("\nHasil Input String" + kata1 + kata2);

}
}
