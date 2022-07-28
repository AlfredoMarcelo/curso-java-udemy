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

    /* .replace(), no muta el string original, se indica el char a cambiar */
    String trabalengua = "trabalengua";
    System.out.println("\ntrabalengua = " + trabalengua.replace("a", "."));

    /* .indexOf(), retorna la primera posicion en que encuentre un char, si no existe arrojara un -1*/
    System.out.println("trabalengua.indexOf() = " + trabalengua.indexOf('a'));

    /* .lastIndexOf() retorna la primera posicion de un char pero revisando de derecha a izquierda , si no existe arrojara un -1*/
    System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));

    /* .contains(), retorna un boolean true si encuentra, falso si no esta*/
    System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t")); //true
    
    
    /* .startWith() si comienza con un char o cadena indicada retornara true, sino false*/
    System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba")); //true
    
    /* .endWith() lo mismo que startWith() pero lee de derecha a izquierda, devuelve true o false*/
    System.out.println("trabalengua.endsWith(\"ua\") = " + trabalengua.endsWith("ua")); //true

    /* .trim(), quitamos espacios en blancos en ambos lados, importante al trabajar con formularios */
    System.out.println("  trabalengua    ".trim());
  }
}
