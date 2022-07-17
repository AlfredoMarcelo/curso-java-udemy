public class EjemploVariables {
    public static void main(String[] args) {

        String saludar = "hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());//String tiene metodos


        int numero = 10; //32 bites
        Integer numeroInt = 20; // el Integer tiene metodos
        System.out.println("numeroInt = " + numeroInt);
        int numero2 = 0;

        boolean valor = true;
        if(valor){
            numero2 = 10;
        }
        System.out.println(numero2);//error

        //variables dinamicas

        var numero3 = "15";
    }
}
