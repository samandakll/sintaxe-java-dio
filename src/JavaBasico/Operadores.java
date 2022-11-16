package JavaBasico;

public class Operadores {
	
	public static void main(String[] args) {
		
		//classe Operadores.java
		String nome = "GLEYSON";
		int idade = 22;
		double peso = 68.5;
		char sexo = 'M'; // Unico caracter entre aspas simples
		boolean doadorOrgao = false; // False ou True
//		Date dataNascimento = new Date(); Classe > usa a palavra new
		
		
		//classe Operadores.java
		double soma = 10.5 + 15.7;
		int subtração = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3; //restos da divisão
		double resultado = (10 * 7) + (20/4);
		
		// o simbolo + entre Strings ele é uma concatenação
		String nomeCompleto = "LINGUAGEM" + " JAVA";
		
		System.out.println(nomeCompleto);
				
		//qual o resultado das expressoes abaixo?
		String concatenacao ="?"; 

		concatenacao = 1+1+1+"1";
		
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+1;
		
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+"1";
		
		System.out.println(concatenacao);

		concatenacao = "1"+1+1+1;
		
		System.out.println(concatenacao);

		concatenacao = "1" + (1+1+1);
				
		
		System.out.println(concatenacao);
		
		//classe Operadores.java
		int numero = 5;
				
		//Imprimindo o numero negativo
		System.out.println(- numero);
		System.out.println( numero);

		//incrementando numero em mais 1 numero, imprime 6
		numero ++; //numero+1
		System.out.println(numero);

		//incrementando numero em mais 1 numero, imprime 7
		System.out.println(numero ++);// ops algo de errado não está certo

		System.out.println(numero);// agora sim, numero virou 7

		//ordem de precedencia conta aqui
		System.out.println(++ numero);
		
		System.out.println(--numero);
		System.out.println(numero--);
		System.out.println(numero);

		boolean verdadeiro = true;

		System.out.println("Inverteu " + !verdadeiro);
		
		// classe Operadores.java
		int a, b, c, d;

		a = 5;
		b = 6;
		
		String valor = "";

		 //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b)
		   valor = "verdadeiro";
		else
		   valor = "falso";
		
		System.out.println(valor);
		
		c = 6;
		d = 6;

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String valor1 = c==d ? "verdadeiro" : "false";

		System.out.println(valor1);
	}

}
