public class PrimitivosEnteros {
    public static void main(String[] args){

        byte numeroByte = 127;//max 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("tipo byte min " + Byte.MIN_VALUE);
        System.out.println("tipo byte max " + Byte.MAX_VALUE + "\n");

        short numeroShort = 30000;//max 32767
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("tipo short min " + Short.MIN_VALUE);
        System.out.println("tipo short max " + Short.MAX_VALUE + "\n");

        int numeroInt = 2147483647;//max 2147483647
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("tipo int min " + Integer.MIN_VALUE);
        System.out.println("tipo int max " + Integer.MAX_VALUE + "\n");

        long numeroLong = 9223372036854775807L;// debe llevar una L mayusc al final
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("tipo long min " + Long.MIN_VALUE);
        System.out.println("tipo long max " + Long.MAX_VALUE);


    }
}
