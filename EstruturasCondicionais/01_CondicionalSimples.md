
Estruturas Condicionais
Condicional Simples

A estrutura condicional possibilita a escolha de um grupo de acoes e comportamentos a serem 
executadas quando determinadas condicoes sao ou nao satisfeitas.
A estrutura Condicional pode ser Simples ou Composta.


Condicionais Simples

Quando ocorre uma validacao de execucao de fluxo somente
quando a condicao for positiva, consideremos como uma 
estrutura Simples, exemplo.

Inicio - Sacar - ContemSaldo? Sim => AtualizaSaldo
Inicio - Sacar - ContemSaldo? Nao => Fim

// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}















