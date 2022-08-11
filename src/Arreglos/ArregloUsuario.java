package Arreglos;

public class ArregloUsuario {
  public static void main(String[] args) {


    Usuario[] usuarios = new Usuario[2];
    Usuario usuario = new Usuario();
    usuario.setNombre("alfredo");
    usuario.setEdad(29);
    usuarios[0] = usuario;

    Usuario usuario2 = new Usuario();
    usuario2.setNombre("Marcelo");
    usuario2.setEdad(20);
    usuarios[1] = usuario2;

    System.out.println("usuarios = " + usuarios[0].toString());
    System.out.println("usuarios = " + usuarios[1].toString());

  }




}
