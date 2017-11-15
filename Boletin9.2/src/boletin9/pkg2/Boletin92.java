
package boletin9.pkg2;

import java.util.Scanner;

public class Boletin92 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in); 
        
        int suma = 0;
        double producto = 1;
        
        for(int i = 10; i <= 90; i++){

            suma +=i;
            producto = producto * i;
        }
        
        System.out.print("La suma es: " + suma + ", El producto es: " + producto);
    }
    
}
