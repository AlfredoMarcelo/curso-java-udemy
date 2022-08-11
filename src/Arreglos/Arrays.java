package Arreglos;

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args){

    String [] apellidos = new String[5];
    apellidos[0] = "alfredo";
    apellidos[1] = "renata";
    apellidos[2] = "chocolo";
    apellidos[3] = "nene";
    apellidos[4] = "pablo";

    for(int cont = 0; cont < apellidos.length; cont ++){
      System.out.println(apellidos[cont]);
    }

    int [] precios = new int[3];

    Scanner teclado = new Scanner(System.in);

    int total = 0;
    for(int cont = 0; cont < precios.length; cont++){
      System.out.println("ingrese el precio numero " + (cont+1));
      precios[cont] = teclado.nextInt();
      total += precios[cont];
    }
    /* for(int cont = 0; cont < precios.length; cont ++){
      System.out.println("precios numero " + (cont + 1) + " = $"+ precios[cont]);
    }*/
    System.out.println("total = " + total);
    double promedio = total / precios.length;
    System.out.println("promedio = " + promedio);
  }
}
