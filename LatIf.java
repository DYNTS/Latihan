/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author DIAN
 */
public class LatIf {
  public static void main(String[] args)

{
double tot_beli, potongan=0, jum_bayar=0;
Scanner input = new Scanner(System.in);

System.out.print("total pembelian Rp. ");
tot_beli = input.nextDouble();
    if (tot_beli >=50000)
    potongan = 0.2 * tot_beli;
System.out.print("besarnya potongan Rp. " + potongan);
jum_bayar = tot_beli - potongan;
System.out.println("jumlah yang harus dibayarkan Rp. " + jum_bayar);
}
}
