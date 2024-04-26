
package com.mycompany.ejerciosexcepciones;

import java.util.Scanner;


public class EjerciosExcepciones {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("ingrese un número");
        int number = scanner.nextInt();
        
        Even even = new Even();
        try{
        even.isEven(number);
        } catch(Exception e){
            System.out.println("Ha ocurrido un error; " + e.getMessage());
        }
    }
}
