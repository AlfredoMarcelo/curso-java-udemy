package cadenasString;

public class EjemploString {
  public static void main(String[] args) {
    
    /* Declaracion de String*/
    
    // Manera Literal
    String course = "Java programing";
    
    // manera instancia
    String course2 = new String("Java Programing");
    
    // esto solo compara el tipo de declaracion del String
    boolean isEquals = course == course2;
    System.out.println("isEquals = " + isEquals);             // false
    
    boolean isEqualsMethod = course.equals(course2);          // .equals() discrimina Mayuscula y minusculas y tildes
    System.out.println("isEqualsMethod = " + isEqualsMethod); //false

    boolean isEqualsIgnoreCaseMethod = course.equalsIgnoreCase(course2);           //no descrimina mayusc y minusc
    System.out.println("isEqualsIgnoreCaseMethod = " + isEqualsIgnoreCaseMethod); //true

    /* Es importante no utilizar los operadores de comparacion == con Objetos String, se recomienda
        usar el equals() y equalsIgnoreCase().
    * */


    
    
    
    
    
  }
}
