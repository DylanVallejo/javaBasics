package types;

public class EjemploCaracteres {
    public static void main(String[] args) {
        char character = 'a' ;
        System.out.println(character);
//        character = 'b';
        character = 65;
        System.out.println(character);

        character = 65+1;
        char segundoCaracter = (char) (character +1);
        System.out.println(segundoCaracter);


        String palabra = "try hardeando hasta el final ";
        System.out.println(palabra);


        palabra = palabra + "2020";
        System.out.println(palabra);
    }
}
