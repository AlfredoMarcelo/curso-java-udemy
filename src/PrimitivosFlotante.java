public class PrimitivosFlotante {
    public static void main(String[] args){
        float realFloat = 1.0f;//se debe declarar el numero con una f, si no se hace indicará un error
        float realE = 0.000000015f;//1.5e8 a esto equivale en notacion cientifica
        System.out.println("realFloat = " + realFloat);
        System.out.println("realE = " + realE);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("tipo float min " + Float.MIN_VALUE);
        System.out.println("tipo float max " + Float.MAX_VALUE + "\n");

        double realDouble = 3.4028345454;// no es necesario declarar el tipo de valor al final
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("tipo double min " + Double.MIN_VALUE);
        System.out.println("tipo double max " + Double.MAX_VALUE + "\n");

        var varFlotante = 3.1416;//va a ser doble, porque no se declara la f de float
        System.out.println("varFlotante = " + varFlotante);


    }
}
