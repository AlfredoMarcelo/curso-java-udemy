package wrapersDePrimitivos;

public class WraperOperadoresRelacionales {
  public static void main(String[] args) {

    // objetos que tiene un valor anidado o encapasulado dentro de la instancia del Integer

    Integer num1 = Integer.valueOf(1000);
    Integer num2 = num1;                    // se le pasa la referencia de num 1

    System.out.println("num1 = " + num1); // son los mismos numeros, pero son objetos que tiene un valor anidado
    System.out.println("num2 = " + num2); // son los mismos numeros, pero son objetos que tiene un valor anidado

    System.out.println("Son el mismo objet? " + (num1 == num2)); //true, porque es un objeto que esta asignado a dos variables

    num2 = 1000; // A num2 se le asigna el mismo valor pero en una NUEVA INSTANCIA

    System.out.println("num1 = " + num1); // son los mismos numeros, pero son objetos que tiene un valor anidado
    System.out.println("num2 = " + num2); // son los mismos numeros, pero son objetos que tiene un valor anidado

    System.out.println("Son el mismo objet? " + (num1 == num2)); //false, porque es una nueva instancia

    // el comparador == en Wraper, compara si la instancia es la misma
    // el comparador == en primitivos compara si son el mismo valor
    // los primitivos no son objetos, son valores
    System.out.println("Ambos objetos num1 y num2 tienen el mismo valor " + num1.equals(num2));//true
    System.out.println("objetos num1 y num2 con intValue() son iguales? " + (num1.intValue() == num2.intValue()));//true
  }
}
