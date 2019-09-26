package pkg2120180199.sk01.pbo.ti20192020.pkg3.pkg4.pkg01;

import java.util.Scanner;

public class SK01PBOTI201920203401 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 1; i < tinggi; i++) {
             for (int j = 1; j < i; j++) {
                 System.out.print("1");
             }
             System.out.println("");
        }
           
    }
    
}
