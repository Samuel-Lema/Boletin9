
package boletin3;

import java.util.Scanner;

public class Boletin3 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in); 
        
        float base;
        float altura;

        do{
            System.out.print("Introduce a base: ");
            base = reader.nextFloat();
            
        } while(base < 0);
        
        do{
            System.out.print("Introduce a altura: ");
            altura = reader.nextFloat();
            
        } while(altura < 0);
        
        System.out.print("El area es: " + (base * altura));
        
    }
    
}
