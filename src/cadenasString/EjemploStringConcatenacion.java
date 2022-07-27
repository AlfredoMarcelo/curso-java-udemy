package cadenasString;

public class EjemploStringConcatenacion {
  public static void main(String[] args) {
    
    /* Declaracion de String*/
    
    // Manera Literal
    String course = "Java programing";
    String teacher = "Andrez Guzman";

    String detail = course + " whit teacher " + teacher;
    System.out.println(detail);

    int numberA = 10;
    int numberB = 5;

    /* Presedencia, el clg es de izquierda a derecha, los parentesis tienen mas relevancia */
    System.out.println(detail + numberA + numberB);   // concatena el String con los enteros
    System.out.println(numberA + numberB + detail);   // suma los enteros y pinta el string
    System.out.println(detail + (numberA + numberB)); // primero suma los enteros y luego pinta el resultado + string


    /* Metodo Concat, es mejor este metodo para unir cadenas con otros primitivos */
    String detail2 = course.concat(" con ").concat(teacher);
    System.out.println("detail2 = " + detail2);
    

    
    
    
    
    
  }
}
