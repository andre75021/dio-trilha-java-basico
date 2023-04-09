package edu.andre.assunto.anatomiaDasClasses;

public class MinhaClasse {
    public static void main(String [] args) {
        String primeiroNome = "Andre";
        String segundoNome = "Luiz";
        System.out.print(NomeCompleto(primeiroNome, segundoNome));
    }

    public static String NomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
