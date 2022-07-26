import javax.swing.*;

public class SistemasNumericos {
  public static void main(String[] args) {

    String strNumber = JOptionPane.showInputDialog( null ,"enter a integer number" );
    int decimalNumber = 0;
    try{
      decimalNumber = Integer.parseInt(strNumber);
    } catch (NumberFormatException e){
      JOptionPane.showMessageDialog(null, "Try enter a integer number not a string");
      main(args); //así se llama nuevamente al main, osea empieza el codigo de nuevo
      System.exit(0);
    }


    System.out.println("decimalNumber = " + decimalNumber);

    // Con el wraper de int (Integer), se esta convirtiendo el int numeroDecimal en numero binario
    System.out.println("decimalNumber +  = " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber));


    // Numero binario se declara con 0b (cero y b)
    int binaryNumber = 0b111110100; //

    System.out.println("binaryNumber = " + binaryNumber);

    // con Integer.toOctalString() pasamos el int numeroDecimal a octal
    System.out.println("octal number to  = " + decimalNumber + " = " + Integer.toOctalString(decimalNumber));// 764

    // Asi se declara un entero Octal, se agrega al comienzo un 0
    int octalNumber = 0764;
    System.out.println("octalNumber = " + octalNumber); //500

    System.out.println("hexadecimal number to  = " + decimalNumber + " = " + Integer.toHexString(decimalNumber));// 1f4

    //así se declara un entero hexadecimal, con un 0X antes del numero que lleva una f
    int hexNumber = 0x1f4;
    System.out.println("hexNumber = " + hexNumber); //500

    String messageResult = "";
    messageResult += "\nbinaryNumber = "
            + Integer.toBinaryString(decimalNumber)
            + "\noctalNumbe = " + Integer.toOctalString(decimalNumber)
            + "\nhexNumber = " + Integer.toHexString(decimalNumber);

    JOptionPane.showMessageDialog(null, messageResult);



  }
}
