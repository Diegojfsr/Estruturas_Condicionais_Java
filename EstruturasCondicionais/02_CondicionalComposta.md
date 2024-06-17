
Condicionais Compostas

Algumas vezes o nosso programa devera seguir mais de uma jornada de 
execucao condicionado a uma regra de negocio, este cenario e o denominado
Estrutura Condicional Composta. Vejamos o exemplo.


Inicio - ResultadoEscolar - Nota>=7? Sim => Aprovado
Inicio - ResultadoEscolar - Nota>=7? Nao => Reprovado



// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
    }
}



