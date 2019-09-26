package pkg2120180199.sk01.pbo.ti20192020.pkg3.pkg4.pkg02;

import java.util.Scanner;

public class SK01PBOTI201920203402 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 1; i <= tinggi; i++) {
             for (int j = tinggi - i; j >= 1; j--) {
                 System.out.print(" ");
             }
             for (int j = tinggi - i; j <= tinggi; j++) {
                 System.out.print("2");
                 
             }
             System.out.println("");
        }
       
    }
    
}
