package edu.andre.assunto.operadores;

public class Ternario {
    public static void main(String[] args) {
        // sintaxe = <Expressão condicional> ? <True> : <False>;

        int a, b;

        a = 5;
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
