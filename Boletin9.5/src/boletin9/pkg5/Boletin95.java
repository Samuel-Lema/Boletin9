package boletin9.pkg5;

import java.util.Scanner;

public class Boletin95 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
       
        System.out.print("Introduce un número: ");
        int num = reader.nextInt();
        int a = 2,b = 1,c = 0,d = 1;
       
        System.out.print("a) " + a);
        
        for(int i = 1; i < num; i++){
            a += 2;
            System.out.print(" + " + a);
        }
       
        System.out.println();
        System.out.print("b) ");
       
        for(int i = 0; i < num; i++){
           
           if(b % 2 == 0){
               
               System.out.print(" + " + b);
           } else {
               
               System.out.print(" - " + b);
           }
           
           b += 1;
        }
       
        System.out.println();
        System.out.print("c) ");
       
        for(int i = 0; i < num; i++){
           int temp;
           System.out.print(c + ", ");
           temp = c;
           c = d;
           d += temp;   
           
       }
    }
    
}
