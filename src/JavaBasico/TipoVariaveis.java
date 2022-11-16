package JavaBasico;

public class TipoVariaveis {
	
	public static void main(String[] args) {
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
//		short numeroCurto2 = numeroNormal > dessa forma dá erro, o java entende que pode não comportar a quantidade de numeros
		                               
		short numeroCurto2 = 1;
		int numeroNormal1 = numeroCurto2;
		short numeroCurto3 = (short) numeroNormal1; //deve deixar explicito o que deseja
		
		//se deseja que valor não mude
		
		final double VALOR_DE_PE = 3.14; // Usa a palavra Final e constante em CAIXA ALTA
		
		
	}

}
