package com.natalia.cursojava.aula27;

public class Exerc02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		conta.valorEspecialUsado = 0;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente");
		}

	}

}
