package types;

public class TestConversion {

    public static void main (String[] args){
        //realizando conversiones de tipo de dato  !!!! cast !!!!1
         float puntoFlotante = 3.14f;   // aqui!

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println (valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
