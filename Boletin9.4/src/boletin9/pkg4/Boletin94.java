
package boletin9.pkg4;

import java.util.Scanner;

public class Boletin94 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in); 
        
        int num = 0;
        
        do {
            
            System.out.print("Introduce un número:");
            num = reader.nextInt();
            
            if (num == 0) {
                
            } else {
                System.out.println(num + " *  1 = " + (num * 1));
                System.out.println(num + " *  2 = " + (num * 2));
                System.out.println(num + " *  3 = " + (num * 3));
                System.out.println(num + " *  4 = " + (num * 4));
                System.out.println(num + " *  5 = " + (num * 5));
                System.out.println(num + " *  6 = " + (num * 6));
                System.out.println(num + " *  7 = " + (num * 7));
                System.out.println(num + " *  8 = " + (num * 8));
                System.out.println(num + " *  9 = " + (num * 9));
                System.out.println(num + " *  10 = " + (num * 10));
                
            }
            
        } while(num != 0);
        
    }
    
}
