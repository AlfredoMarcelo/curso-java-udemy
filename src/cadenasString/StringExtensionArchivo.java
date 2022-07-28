package cadenasString;

public class StringExtensionArchivo {
  public static void main(String[] args){


    /* con estos metodos se extraen los char despues del punto */
    String document = "image.docx";
    int i = document.lastIndexOf(".");
    System.out.println("document.length() = " + document.length());
    System.out.println("document.length() = " + document.substring(i + 1));

  }
}
