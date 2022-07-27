package cadenasString;

public class EjemploStringInmutable {
  public static void main(String[] args) {
    
    /* Declaracion de String*/
    
    // Manera Literal
    String course = "Java programing";
    String teacher = "Andrez Guzman";

    String result = course.concat(teacher);
    System.out.println("course = " + course); // Java Course, aunque haya sido concatenado, no cambia su valor original
    System.out.println("result = " + result); //concat crea una nueva instancia u objeto con la concatenacion
    System.out.println(course == result); // false, porque son diferentes instancias

    /* Metodo .transform(), utiliza una arrow function y crea una nueva instancia*/

    String result2 = course.transform(c -> {                   // el parametro c es el String que se esta transform()
      return c + " with " + teacher;                           // c = course
    });
    System.out.println("\n");
    System.out.println(course);                                // no se modifica su valor
    System.out.println("result2 with transform = " + result2); // nueva instancia

    String result3 = result.replace("a", "A");  //remplaza todos las a por A
    System.out.println("result = " + result);                   //no se modifica su valor
    System.out.println("result3 = " + result3);                 //nueva instancia modificada

    
    
    
    
    
  }
}
