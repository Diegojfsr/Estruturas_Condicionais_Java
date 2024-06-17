
public class ResultadoEscolarIII {
	public static void main(String[] args) {

        // Cenário 1
		int nota1 = 7;
		String resultado1 = nota1 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1);

        // Cenário 2
        int nota2 = 6;
        String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
	}
}

