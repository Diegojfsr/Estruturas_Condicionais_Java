
Condicao Ternaria

Como vimos em operadores, podemos abreviar nosso algoritmo condicional
refatorando com o conceito de operador ternario.
Vamos refatorar os exemplos para ilustart o poder deste recurso.

// Cenário 1
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
Copy
// Cenário 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
