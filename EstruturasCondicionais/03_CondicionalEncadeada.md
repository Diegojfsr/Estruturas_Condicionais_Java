
Condicionais Encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao 
se(if) senao(else) poderemos ter uma terceira, quarta ou inumeras condicoes.


Inicio - ResultadoEscolar - Nota >= 7? sim Imprimeaprovado
Inicio - ResultadoEscolar - Nota >= 7? nao - Nota >= 5 e Nota < 7? sim ImprimeRecuperacao
Inicio - ResultadoEscolar - Nota >= 7? nao - Nota >= 5 e Nota < 7? nao ImprimeReprovado

// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}

