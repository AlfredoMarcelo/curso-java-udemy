package cadenasString;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
  public static void main(String[] args){

    System.out.println("");
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Ingresa el nombre del primer integrante");
    String name1 = keyboard.next();
    System.out.println("Ingresa el nombre del segundo integrante");
    String name2 = keyboard.next();
    System.out.println("Ingresa el nombre del tercer integrante");
    String name3 = keyboard.next();
    System.out.println(
            name1.toUpperCase().charAt(1) + "." + name1.substring(name1.length()-2)
            + "_" + name2.toUpperCase().charAt(1) + "." + name2.substring(name2.length()-2)
            + "_" + name3.toUpperCase().charAt(1) + "." + name3.substring(name3.length() -2)
    );

  }
}
