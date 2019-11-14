/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_3;

/**
 *
 * @author H4NS
 */
public class Pembayaran_gaji {
    public int hitunganGaji(Latihan_4 peg){
        int uang=peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staff)
            uang+=((Staff)peg).Bonus();
        return uang;
    }
    public static void main(String[] args) {
        Pembayaran_gaji pg=new Pembayaran_gaji();
        Staff ali = new Staff();
        Direktur tony= new Direktur();
        System.out.println("Gaji Yang Dibayarkan Untuk Staff = "+pg.hitunganGaji(ali));
        System.out.println("Gaji yang dibayarkan Untuk Staff = "+pg.hitunganGaji(tony));
    }
}
