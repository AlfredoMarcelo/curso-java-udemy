package cadenasString;

public class TestRendimiento {
  public static void main(String[] args) {
    
    /* Declaracion de String*/
    
    // Manera Literal
    String a = "a";
    String b = "b";
    String c = a;

    StringBuilder sb = new StringBuilder(a); // es mutable, la mejor manera si buscamos velocidad

    long start = System.currentTimeMillis();

    for(int i = 0; i < 1000; i++){
      //c = c.concat(a).concat(b).concat("\n"); // 500 => demoro 2 ms, 1000 => demora 4 ms
       //c += a + b + "\n";                      // 500 => se demoro 13 ms, 1000 => 15ms
      sb.append(a).append(b).append("\n");        // 500 => se demoro 0 ms, es el mejor, mas rapido,1000 => 1ms
    }


    long end = System.currentTimeMillis();
    System.out.println(end - start);
    System.out.println("c = " + c);
    System.out.println("sb = " + sb.toString());



    

    
    
    
    
    
  }
}
