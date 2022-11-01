package edu.rayza.javabasico;

public class Operadores {

    public static void main(String[] args) throws Exception {

        //Operador de atribuição
        String nome = "Rayza";
        int idade = 26;
        double peso = 90.5;
        char sexo = 'F';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();

        //Operadores aritmeticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //O operador de adição (+), quando utilizado em variáveis do tipo texto
        // realizará a “concatenação de textos"

        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);
        
        //a partir do momento que há um texto, o sistema realiza a 
        //concatenação e para de efetuar o calculo matematico

        //operadores unarios

        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero); //se os sinais forem antes, atualiza antes de imprimir.
        //se for depois, imprime o valor atual e ai atualiza

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

    
        
}
}