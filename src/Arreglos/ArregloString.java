package Arreglos;

import java.util.Arrays;

public class ArregloString {
  public static void main(String[] args){
    // al declarar una arreglo se puede agregar al tipo de dato o al nombre de la variable
    String[] mascotas = new String[3];
    mascotas[0] = "renata";
    mascotas[1] = "filo";
    mascotas[2] = "Filo";

    // le da prioridad a las letras mayusculas
    // tambien se puede pasar un argumento de arreglo int
    Arrays.sort(mascotas);

    System.out.println("mascota  0 = " + mascotas[0]);
    System.out.println("mascota 1 = " + mascotas[1]);
    System.out.println("mascotas[2] = " + mascotas[2]);

  }

}
