package wrapersDePrimitivos;

public class WrapperBoolean {
  public static void main(String[] args) {
    
    Integer num1, num2;
    num1 = 1;
    num2 = 2;
    
    boolean primoBoolean = num1 > num2; //false
    System.out.println("primoBoolean = " + primoBoolean);
    Boolean objBoolean = false; //Autoboxing, se empaqueta en la instancia Boolean, false es primitivo
    Boolean bojBoolean2 = Boolean.valueOf(primoBoolean); // Otra forma de empaquetar un primitov boolean
    System.out.println("bojBoolean2 = " + bojBoolean2);
  }
}
