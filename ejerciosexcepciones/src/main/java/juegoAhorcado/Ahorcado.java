
package juegoAhorcado;


public class Ahorcado {
    public static void main(String[] args) {
        String palabra = "consola";
        int intentosFaltantes = 6;
        Validation ahorcadoJuego = new Validation(palabra,intentosFaltantes);
        ahorcadoJuego.jugar();
   }
      
}
