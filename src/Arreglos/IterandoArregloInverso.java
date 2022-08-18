package Arreglos;

public class IterandoArregloInverso {
  public static void main(String[] args) {
    int[] numeros = new int[3];
    int total = numeros.length;
    System.out.println("total = " + total);
    for(int i = 0; i < total;i++){
      numeros[i] = i * 2;
    }
    for(int i = 0; i < total; i++){
      System.out.println(numeros[total-1-i]);
    }
    System.out.println("\n");
    for(int i = total-1; i >= 0 ;i--){
      System.out.println(numeros[i]);
    }

  }
}
