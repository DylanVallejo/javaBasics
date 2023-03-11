package types;

public class TestPuntoFlotante {
    public static void main (String[] args){
//        double salario = 1250.70;
//        System.out.println("Mi salrio es: "+ salario  );

//        int valor = 12.5;             //no compila.

//        int valor2 = 0.0;             //no compila.

//        double test = 125.50;        // compila

//        int valor3 = test;

//        double division = 5.0 / 2;
//        System.out.println (division);



//      haciendo  variables compatibles

        double varibale1 = 280.39;
        int varibleEntero = (int) varibale1; //cast
        System.out.println(varibleEntero);

        long prueba = 122222222222222L;
        short numeroPequeño = 13555;
        byte numeroAunMasPequeño = 15;
        float numeroDecimalPequeño = 2.5F;

        int resultado = (int) varibale1 + varibleEntero;
        System.out.println(resultado);
    }
}
