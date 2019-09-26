package pkg2120180199.sk01.pbo.ti20192020.pkg3.pkg4.pkg03;

import java.util.Scanner;

public class SK01PBOTI201920203403 {

public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 0; i <= tinggi; i++) {
             for (int j = tinggi - i; j >= 0; j--) {
                 System.out.print("3");
             }
             System.out.println("");
        }
       
    }
    
}
