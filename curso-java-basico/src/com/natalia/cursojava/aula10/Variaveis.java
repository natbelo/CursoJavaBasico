package com.natalia.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		//convenção Java
		int idade = 20;
		String nome = "Natália";
		String ano = "2021";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String meu_nome;
		String meuNomeString;
		
		idade = 30;
		
		System.out.println("Idade =  " + idade);
		System.out.println("Nome =  " + nome);
		
		//má prática
		int a = 10;
		String b = "Natália";
		

	}

}
