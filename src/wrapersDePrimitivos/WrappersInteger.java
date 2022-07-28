package wrapersDePrimitivos;

public class WrappersInteger {
  public static void main(String[] args) {

    /*new esta deprecado*/

    // convirtiedo int a wraper Integer
    int intPrimitive = 33;
    Integer intObject = Integer.valueOf(intPrimitive);
    System.out.println("intObject = " + intObject);

    // conviertiendo de wraper a int
    int num = intObject;
    int num2 = intObject.intValue();
    System.out.println("num2 = " + num2);


  }
}
