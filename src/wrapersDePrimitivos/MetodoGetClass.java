package wrapersDePrimitivos;

import java.lang.reflect.Method;

public class MetodoGetClass {
  public static void main(String[] args) {
    
    String texto = "Hola que tal!";
    
    Class strClass = texto.getClass();
    System.out.println("strClass.getName() = " + strClass.getName()); ///java.lang.String es el package raiz o principal de java
    System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName()); //String
    System.out.println("strClass.getPackageName() = " + strClass.getPackageName()); //java.lang
    
    System.out.println("strClass = " + strClass);
    
    for(Method metodo: strClass.getMethods()){
      System.out.println("metodo.getName() = " + metodo.getName());
    }
    
    Integer num = 34;
    Class intClass = num.getClass();
    Class objClass = intClass.getSuperclass().getSuperclass();
    System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());// Integer
    System.out.println("intClass.getPackageName() = " + intClass.getPackageName()); //java.lang
    System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //Number, Integer extiende de Number
    System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass()); //Object

    for(Method metodo: objClass.getMethods()){
      System.out.println("metodo.getName() = " + metodo.getName());
    }
  }
}
