package Arreglos;

import java.util.Arrays;

public class IterandoArregloFor {
  public static void main(String[] args) {

    String[] mascotas = new String[3];
    int total = mascotas.length;

    mascotas[0] = "renata";
    mascotas[1] = "filo";
    mascotas[2] = "chocolo";

    Arrays.sort(mascotas);
    
    for(int i = 0; i < total; i++){
      System.out.println(mascotas[i]);
    }
    System.out.println("===========" +
            "\nUsando forEach");
    //forEach
    for(String mascota: mascotas){
      System.out.println("mascota = " + mascota);
    }

    // while
    System.out.println("\n========"+ "\nUsando WHile");
    int contador = 0;

    while (contador < total){
      System.out.println(mascotas[contador]);
      contador++;
    }

    // Dowhile, al menos se ejecuta una vez
    System.out.println("\n========"+ "\nUsando DoWHile");

    int contador2 = 0;
    do{
      System.out.println(mascotas[contador2]);
      contador2++;
    }while (contador2 < total);

  }
}
