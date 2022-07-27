package cadenasString;

public class Metodos {
  public static void main(String[] args){
    /* METODOS PARA STRING */
    String name = "alfredo";

    /* .length() cuenta los caracteres del string */
    System.out.println("name.length() = " + name.length());// 7

    /* .toUpperCase(), convierte a mayusculas */
    System.out.println("name.toUpperCase() = " + name.toUpperCase()); // ALFREDO,

    /* .toLowerCase, convierte a minusc */
    System.out.println("name.toLowerCase() = " + name.toLowerCase());

    /* .equals(), compara un string con otro, compara el caracter*/
    System.out.println("name.equals(\"Alfredo\") = " + name.equals("Alfredo")); //false por la mayusc

    /* .equalsIgnoreCase(), compara el valor del string sin discriminar mayus y minusc */
    System.out.println("name.equalsIgnoreCase = " + name.equalsIgnoreCase("Alfredo")); //true

    /* .compareTo(), ordena segun un orden hexa o unicode */
    System.out.println("name.compareTo(\"Alfredo\") = " + name.compareTo("Alfredo")); //0, si es 0 son identicos

    /* .charAt() convierte un string en caracteres o extrae uno por el indice*/
    System.out.println("name.charAt(0) = " + name.charAt(0));// a, extra el char del indice 0, parte en 0
    
    /* Manera dinamica de extraer el ultimo caracter con .charAt() y .length()*/
    System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));//o, trae el ultimo dinamico

    /* .subString(), para extraer char desde un indice en adelante */
    System.out.println("name.substring(4) = " + name.substring(4)); //edo, incluye el valor del index 4 en adelante
    System.out.println("name.substring(4) = " + name.substring(1, 4)); //lfr, incluye el primer index el segundo "no"
    System.out.println("name.substring(4) = " + name.substring(name.length()-2)); //do, estrae los ultimos 2



  }
}
