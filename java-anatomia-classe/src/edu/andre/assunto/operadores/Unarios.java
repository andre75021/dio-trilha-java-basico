package edu.andre.assunto.operadores;

public class Unarios {
    public static void main(String[] args) {
        // (-) operador que muda numeros positivos para negativos
        int numero = 5;
        System.out.println(numero);
        numero = -numero; // A variável trocou de sinal;
        System.out.println(numero);

        // (++) Operador de incremento;
        int inc = 1;
        System.out.println(inc);
        inc = ++inc; // ou somente ++ inc
        System.out.println(inc);

        // (--) Operador de decremento;
        int dec = 1;
        System.out.println(dec);
        dec = --dec; // ou somente -- Dec
        System.out.println(dec);

        // (!) operador de negação

        if  (! (dec > 0)){
            System.out.println("Não deveria ser impresso pois dec é igual a zero");
            System.out.println(dec);
        }
    }
}
