
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
  public static void main(String[] args) {

    /* Scanner se debe instanciar y como es un objeto se debe crear con new Scanner, dentro de deble declarar que
        van a entrar datos con System.in
    */
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a integer number");

    // nextLine() pausa la consola esperando que se ingrese un dato
    //String strNumber = keyboard.nextLine();
    int decimalNumber = 0;
    try{
      decimalNumber = keyboard.nextInt();//Integer.parseInt(strNumber);

      /*
        Dentro del parametro de catch podemos utilizar exception que envuelve todos los tipos
        de excepciones y así no declaramos uno solo en particular
      * */

    } catch (Exception e){                                 // en el catch debemos informar el error que
      System.out.println("Please, enter a integer number!");              //queremos manejar
      main(args); //así se llama nuevamente al main, osea empieza el codigo de nuevo
      System.exit(0);
    }

    String messageResult = "";
    messageResult += "\nbinaryNumber = "
                  + Integer.toBinaryString(decimalNumber)
                  + "\noctalNumbe = " + Integer.toOctalString(decimalNumber)
                  + "\nhexNumber = " + Integer.toHexString(decimalNumber);

    System.out.println(messageResult);



  }
}
