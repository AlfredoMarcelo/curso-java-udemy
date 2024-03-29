public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;                      //true
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3;                         //98.76543
        System.out.println("d = " + d);
        float f = 1.2345e2f;                            //123.45
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico + "\n");
        
        boolean esIgual = 3-3 == 1;                     //siempre el == es para comparar
        System.out.println("esIgual = " + esIgual);     //true
        
        boolean esigual2 = 1 == 1;
        System.out.println("esigual2 = " + esigual2);   //true

        boolean esIgual3 = 1 == '1';                    // En java no esta el comparador estricto, solo ==
        System.out.println("esIgual3 = " + esIgual3);   //false
        
        
    }
}
