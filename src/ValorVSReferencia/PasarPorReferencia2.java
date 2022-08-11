package ValorVSReferencia;

class Persona{
  private String nombre;

  public void modificarNombre(String nuevoNombre){
    this.nombre = nuevoNombre;
  }
  public String leerNombre(){
    return this.nombre;
  }
}

public class PasarPorReferencia2 {
  public static void main(String[] args) {

    Persona persona = new Persona();
    persona.modificarNombre("Andrés");
    System.out.println("iniciamos el metodo main");

    System.out.println("persona.nombre = " + persona.leerNombre());
    
    System.out.println("antes de llamar al metodo test");
    test(persona);
    System.out.println("Despues de llamar al metodo test");
    System.out.println("persona.nombre = " + persona.leerNombre()); //pepo
    System.out.println("finaliza el metodo main con los datos modificados");


  }

  public static void test(Persona persona){
    System.out.println("Iniciamos el metodo test");
    persona.modificarNombre("Pepo");
    System.out.println("finaliza el metodo test");
  }
}
