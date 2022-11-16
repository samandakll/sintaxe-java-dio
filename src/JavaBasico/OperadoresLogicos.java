package JavaBasico;

public class OperadoresLogicos {

	public static void main(String[] args) {

		// Operadores.java
		boolean condicao1 = true;

		boolean condicao2 = false;

		/*
		 * Aqui estamos utilizando o operador lógico E para fazer a união de duas
		 * expressões. É como se estivesse escrito:
		 * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
		 */

		if (condicao1 && condicao2)
			System.out.println("Os dois valores precisam ser verdadeiros");
		;

		// Se condicao1 OU condicao2 for verdadeira, executar código.
		if (condicao1 || condicao2)
			System.out.println("Um dos valores precisa ser verdadeiro");

		// ComparacaoAvancada.java
		int numero1 = 1;
		int numero2 = 1;
		
		if (numero1 == 1 && (++numero2) == 2)
			
			System.out.println("As 2 condições são verdadeiras");

		System.out.println("O numero1 agora é " + numero1);
		System.out.println("O numero2 agora é " + numero2);

	}
}
