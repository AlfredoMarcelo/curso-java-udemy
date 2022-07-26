public class ConversionDeTipos {
  public static void main(String[] args){

    String strNumber = "50";


    /*Cambiando un String a int con parseInt*/
    int intNumber = Integer.parseInt(strNumber);
    System.out.println("intNumber = " + intNumber);

    /*Cambiando un String a double con el wraper Double.parseDouble()*/
    String strReal = "98765.43e-3";               //recordar que al usar -3 quiere decir 3 numeros a la izquierda
    double doubleReal = Double.parseDouble(strReal);
    System.out.println("doubleReal = " + doubleReal);


    /*Cambiando un String a int con parseInt*/
    String strLogic = "true";                               // tambien acepta "TRUE",""
    boolean booleanLogic = Boolean.parseBoolean(strLogic);
    System.out.println("booleanLogic = " + booleanLogic);

    /*--------------------------------------------------------------------------------------------------------------*/

    int otherIntNumber = 100;
    System.out.println("\n\notherIntNumber = " + otherIntNumber);

    /* Cambiando de tipo primitivo a cadenas */
    String otherStrNumber = Integer.toString(otherIntNumber);     //Aqui se utiliza el wraper Integer pero el metodo
    System.out.println("otherStrNumber = " + otherStrNumber);       //toString (de entero a cadena)

    otherStrNumber = String.valueOf(otherIntNumber + 10);       //suma si el param es int, si es cadena los juntara
    System.out.println("otherStrNumber = " + otherStrNumber);     // ahora es string

    /* Cambiando de tipo real a cadenas */

    double otherDoubleReal = 1.23456e2;                         // con e2 corre la coma dos veces a la derecha
    String otherRealStr = Double.toString(otherDoubleReal);
    System.out.println("otherRealStr = " + otherRealStr);

    otherRealStr =String.valueOf(1.23456e2f);                 // usando la clase String.valueOf();
    System.out.println("otherRealStr = " + otherRealStr);         //puede escribir la literal directa en el param

    /*--------------------------------------------------------------------------------------------------------------*/

    /* Conversion de prmitivos a primitivos */

    /* Cast o casting es forzar la conversion, para usarlo solo se agrega entre () el tipo de dato
          ej: long l = (int)i;
     * Hay que tener cuidado con la conversión de datos grandes a tipos pequenios
     * conversion de tipos pequeños a grandes no hay problema de perdida de datos
     * Los cast solo se pueden hacer entre primitivos numericos     *********
     */

    int i = 10000;
    short s = (short)i;
    System.out.println("\n\ns = " + s);
    long l = i;
    System.out.println("l = " + l);
  }
}
