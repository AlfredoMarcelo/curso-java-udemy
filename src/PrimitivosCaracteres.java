public class PrimitivosCaracteres {
    public static void main(String[] args){
        char caracter = '\u0040';//@, es un caracter unicode
        char caracterNormal = '@'; //@
        char caracterDecimal = 64;//@


        System.out.println("caracter unicode = " + caracter);
        System.out.println("caracter = " + caracterNormal);
        System.out.println("caracter decimal = " + caracterDecimal);
        System.out.println(caracter == caracterNormal);//true
        System.out.println("\nchar corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character. Max_value = " + Character.MAX_VALUE + "\n");

        char espacio = ' ';
        char retroceso = '\b';// para eliminar el ultimo caracter
        char tabulador = '\t';//para tabular espacio
        char nuevaLinea = '\n'; //nueva linea

        System.out.println("espacio :" + espacio);
        System.out.println("espacio :" + retroceso);
        System.out.println("espacio :" + tabulador + "alfredo");
        System.out.println("salto" + nuevaLinea + "alfredo");
    }
}
