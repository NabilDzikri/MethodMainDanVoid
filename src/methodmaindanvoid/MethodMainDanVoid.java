/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodmaindanvoid;

/**
 *
 * @author ASUS
 */
public class MethodMainDanVoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pribadi prib = new Pribadi();
        
        prib.data();
        
        System.out.println("=======================================================");
        System.out.println("DATA KENDARAAN ANDA");
        System.out.println("Nama Lengkap : "+prib.nama);
        System.out.println("Tahun Kelahiran : "+prib.tahun);
        System.out.println("Alamat :"+prib.tempat);
        System.out.println("Hobby :"+prib.hobby);
        System.out.println("=======================================================");
    }
    
}
