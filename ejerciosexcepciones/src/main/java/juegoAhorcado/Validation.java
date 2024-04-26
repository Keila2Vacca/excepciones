
package juegoAhorcado;

import java.util.Scanner;


class Validation {
     private String palabra;
     private StringBuilder rellenarPalabra;
     private int intentosFaltantes;
     private boolean game;

    public Validation(String palabra, int intentosFaltantes) {
        this.palabra = palabra;
        this.intentosFaltantes = intentosFaltantes;
        this.rellenarPalabra = new StringBuilder();
        int size = palabra.length();
        for (int i = 0; i < size; i++) {
            if(palabra.charAt(i)!= ' '){
                rellenarPalabra.append('-');
            } else {
                rellenarPalabra.append(' ');
            }
            
        }
        this.game = false;
    }
    
    
      public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (!game) {
            System.out.println("Palabra: " + rellenarPalabra.toString());
            System.out.println("Intentos restantes: " + intentosFaltantes);
            System.out.println("Ingresa una letra: ");
            String letra = scanner.nextLine().toLowerCase();
            if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                System.out.println("Ingresa una sola letra válida.");
                continue;
            }
            if (!actualizarPalabra(letra.charAt(0))) {
                intentosFaltantes--;
            }
            if (intentosFaltantes == 0) {
                System.out.println("¡Perdiste! La palabra correcta era: " + palabra);
                game = true;
            } else if (rellenarPalabra.indexOf("_") == -1) {
                System.out.println("¡Felicidades! ¡Has adivinado la palabra: " + palabra);
                game = true;
            }
        }
        scanner.close();
    }

    private boolean actualizarPalabra (char letra){
        boolean letraEncontrada = false;
        int size = palabra.length();
        for (int i = 0; i < size; i++) {
          if(palabra.charAt(i) == letra) {
              rellenarPalabra.setCharAt(i, letra);
                letraEncontrada = true;
            }
        }
        return letraEncontrada;    
    }
     
}
