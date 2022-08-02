package ValorVSReferencia;

public class PasarPorValor {
  public static void main(String[] args) {

    int i = 10; //todo primitivo pasa su valor a una funciion

    System.out.println("iniciamos el metodo main con i = " + i);
    test(i);
    System.out.println("finaliza el metodo main con i (no cambia) = " + i);

  }

  public static void test(int i){
    System.out.println("Iniciamos el metodo test con i= " + i);
    i = 35;
    System.out.println("finaliza el metodo test con i = " + i);
  }
}
