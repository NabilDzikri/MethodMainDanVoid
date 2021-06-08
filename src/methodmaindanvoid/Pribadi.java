/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmaindanvoid;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pribadi {
    Scanner input = new Scanner(System.in);
   
   String tahun,nama;
   int hobby,tempat; 
   
   
   void data(){
       System.out.println("MASUKAN DATA PRIBADI ANDA");
       System.out.print("Nama Lengkap : ");
       tahun = input.nextLine();
       System.out.print("Tahun  : ");
       nama = input.nextLine();
       System.out.print("Alamat :");
       tempat = input.nextInt();
       System.out.print("Hobby :");
       hobby = input.nextInt();
       
   }
}
