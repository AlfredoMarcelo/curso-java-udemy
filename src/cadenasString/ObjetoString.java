package cadenasString;

public class ObjetoString {
  public static void main(String[] args) {

    /* Los String son objetos de java

    * El String es una secuencia de caracteres
    * Un arreglo de varios char unidos
    * Son inmutables
    * Se puede usar comillas dentro de los String utilizando \"xxx\"
    */

    String nombre = new String("andres");
    String secondName = "Andres \" Martinez \"";
    System.out.println("nombre = " + nombre);
    System.out.println("nombre en literal = " + secondName);


    /*---------------------------------------------------*/

    /* Concatenar String */

    String name="Alfredo";
    String lastName = "Supanta";
    String nameLastname = name + lastName;
    System.out.println("\nnameLastname = " + nameLastname);

    /*---------------------------------------------------*/

    /* Comparar String */

    /* Los String no son primitivos
    * Por eso no se pueden comaparar como los primitivos
    * Si se usa == solo va a comparar el tipo de String
    * para comparar el valor de contenido del String se utiliza el metodo xxx.equals(xx2)
    * */

    String str1 = "Hola men";                                                          // se declaro literal
    String str2 = new String("Hola men");                                       //se instancio con new String
    System.out.println("\n\nson el mismo objeto? " + (str1 == str2? "Sep": "Nop"));   //operador ternario
    System.out.println("Tienen el mismo valor? " + (str1.equals(str2)?"Sep":"Nop"));  // operador ternario

    /* Metodos mas utilizados con los String
    * int length() => para saber el numero de caracteres
    * boolean equals(String b) => compara si ambas son iguales por valor
    * boolean equalsIgnoreCase(String b) => compara si ambas son iguales, independiente de mayusculas o minusc
    * int compareTo(String b) compara contra la cadena del argumento, devolviendo
        * un valor negativo si la cadena es anterior a b
        * cero (0) si la cadena es igual a b
        * un valor positivo si la cadena es posterior a b
    * String trim() => Crea un nuevo obejeto String eliminando el espacio en blanco que pudiera haber al principio o final
    * char charAt(int posicion) => extrae un carácter en la posicion indicada
    * */

    /* Otros metodos de la clase String */

    /*
    * char[] toCharArray() => convierte la cadena en un arreglo de caracteres
    * String substring(int a, int b) => extrae la sub-cadena (nueva) entre posiciones a y b
    * String substring(int desde) =>extrae la sub-cadena(nueva) desde la posicion indicada en adelante
    * int indexOf(String cadena) => indica en que posicion se encuentra el caracter(o cadena) indicado por
        * por primera vez, buscando desde el principio
    * int lasIndexOf(String cadena) => Indica en que posicion se encuentra el caracter(o cadena) indicado
        * por primera vez, buscando desde el final
    * boolean startWith(String prefijo) => Dice si la cadena comienza con el prefijo indicado
    * boolean endsWith(String prefijo) => Dice si la cadena termina con el sufijo indicado
    * String[] split(String patron) => Divide la cadena en varias subcadenas utilizando el patron indicado
        *como separador
    * */

    
  }
}
