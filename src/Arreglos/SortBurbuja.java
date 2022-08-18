package Arreglos;

public class SortBurbuja {
  public static void main(String[] args) {
    String[] productos = {"zorro", "televisor", "monitor"};

    int tamano = productos.length;

    for(int i = 0; i < tamano;i++){
      for(int j = 0; j < tamano;j++){
        if(productos[i].compareTo(productos[j]) < 0){
          String auxiliar = productos[i];//zorro
          productos[i] = productos[j]; //zorro
          productos[j] = auxiliar;
        }
      }
    }

    for(String producto: productos){
      System.out.println("producto = " + producto);
    }
  }
}
