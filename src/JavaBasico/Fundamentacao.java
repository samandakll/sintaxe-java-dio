package JavaBasico;

public class Fundamentacao {

	public static void main(String[] args) {
		
		System.out.println("Coisa de doido!");
		
		String meuNome = "Samanda ";
		String primeiroNome = "Kely";
		String segundoNome = "Lima";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		int anoNascimento = 2022;
		
		System.out.println(meuNome+ anoNascimento);
		
		meuNome = "Kely ";
		anoNascimento = 1992;
				
	    System.out.println(meuNome + anoNascimento);
	    
	    System.out.println(nomeCompleto);
	
		
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
		
	}
}

