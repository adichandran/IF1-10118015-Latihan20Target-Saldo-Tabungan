/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan20targersaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program Perhitungan saldo tabungan dengan target
 */
public class IF110118015Latihan20Targersaldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat kurensi indonesia
        DecimalFormat ind = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');
        ind.setDecimalFormatSymbols(formatRp);
        
        int i = 1;
        double hbunga,saldo = 3500000;
        while (i <= 10) {
            hbunga = saldo * 0.08;
            saldo = (int) (saldo + hbunga);
            System.out.printf("Saldo di bulan ke-"+ i + " %s%n",ind.format(saldo));
            i++;
            if (saldo >= 6000000) 
                break;
        }
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
    
}
