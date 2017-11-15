
package boletin9.pkg6;

import java.util.Scanner;

public class Boletin96 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double soldo = 0;
        int contadorS_Alto = 0,contadorS_Medio = 0;
        int i = 0;
        
        do{
            i++;
            System.out.print("Escribe o soldo " + i + ": ");
            soldo = reader.nextDouble();
            
            if(soldo >= 1000 && soldo <= 1750){
                
                contadorS_Alto +=1;
            } else if(soldo < 1000 && soldo >= 1){
                
                contadorS_Medio +=1;
            } else if(soldo < 0){
                i--;
            }
            
        } while(soldo != 0);
        
        System.out.println("Gañan entre 1000 e 1750: " + contadorS_Alto + " traballadores.");
        System.out.println("Gañan menos de 1000: " + ((100 * contadorS_Medio) / contadorS_Alto) + "% dos traballadores.");
    }
    
}
