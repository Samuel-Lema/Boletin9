
package boletin9.pkg1;

import java.util.Scanner;

public class Boletin91 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in); 
        
        int contadorCero = 0;
        int contadorNegativo = 0;
        int contadorPositivo = 0;
        
        for(int i = 1; i <= 10; i++){
            
            System.out.print("Introduce el número " + i + ": ");
            int num = reader.nextInt();
            
            if(num > 0){
                contadorPositivo += 1;
            } else if(num < 0){
                contadorNegativo +=1;
            } else {
                contadorCero +=1;
            }
        }
        
        System.out.println("Hay: " + contadorPositivo + " Positivos, " + contadorNegativo + " Negativos, y " + contadorCero + " Ceros.");
    }
    
}
