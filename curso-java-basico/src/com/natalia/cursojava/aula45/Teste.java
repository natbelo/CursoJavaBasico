package com.natalia.cursojava.aula45;

public class Teste {
		
	public static void main(String[] args) {
		
		/*Aluno aluno = new Aluno();
		Pessoa pessoaAluno = new Pessoa(); //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("é do tipo Pessoa");
		}
		
		if (pessoa instanceof Aluno) {
			System.out.println("é do tipo Aluno");
		}
		
		if (pessoa instanceof Professor) {
			System.out.println("é do tipo Professor");
		}
	}

}
