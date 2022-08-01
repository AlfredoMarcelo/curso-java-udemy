package wrapersDePrimitivos;

public class AutoboxingInteger {
  public static void main(String[] args){

    // Autoboxing anidar o autoconvetir un primitivo en la clase Integer y viceversa

    //Aqui se esta convirtiendo primitivos en la literal
    Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    
    int suma = 0;

    // .intValue() transforma una wraper integer a un primitivo int
    for(Integer i: enteros){
      if(i.intValue() % 2 == 0){
        suma+=i.intValue();
      }
    }
    System.out.println("suma = " + suma); //56


    //Esto demuestra que no es necesario pasar un Integer a int para poder realizar operaciones aritmeticas
      //Java internamente aplica el .intValue() para que se pueda hacer esto

    suma=0;
    for(Integer i: enteros){  // For sin .intValue()
      if(i % 2 == 0){
        suma+=i;
      }
    }
    System.out.println("suma = " + suma); //56, hara exactamente lo mismo que con intValue();
  }
}
