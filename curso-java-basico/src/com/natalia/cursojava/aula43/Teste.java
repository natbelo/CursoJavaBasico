package com.natalia.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCursos("Engenharia");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "ndoanofna";
		String s2 = "ndoanofnA";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCursos("Engenharia");
		double[] notas2 = {10,9,8,7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));

	}

}
