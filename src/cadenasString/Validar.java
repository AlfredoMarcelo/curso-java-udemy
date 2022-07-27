package cadenasString;


public class Validar {
  public static void main(String[] args){

    String course = null;

    boolean esNull = course == null;
    System.out.println("esNull = " + esNull); // true, es nulo
    if(esNull){
      course = ""; //"Programacion java";
    }



    boolean isEmpty = course.length() == 0; //retorna un entero con la cantidad de caracteres
    System.out.println("isEmpty = " + isEmpty); //true, la cadena esta vacia

    /* isEmpty()*/
    boolean isEmpty2 = course.isEmpty();          //metodo para saber si esta vacio o no la cadena
    System.out.println("isEmpty2 = " + isEmpty2); // true

    /* isBlack()*/
    boolean isBlank = course.isBlank();           // solo desde jdk 11 en adelante, revisa si la cadena esta vacia

    if(!isEmpty && isBlank){                               // ! lo cambia a false,
      System.out.println(course.toUpperCase()); // no concatena y genera exception
      System.out.println("bienvenido al curso ".concat(course)); // concatena pero le agrega null
    }
  }
}
