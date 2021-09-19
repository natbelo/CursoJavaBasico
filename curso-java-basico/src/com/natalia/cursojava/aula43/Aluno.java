package com.natalia.cursojava.aula43;

import java.util.Arrays;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public String getCursos() {
		return curso;
	}
	public void setCursos(String cursos) {
		this.curso = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		//super.setCpf("010101010101");
		
		//this.setCpf("010101010101");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno: ";
		//s += super.getEndereco();
		
		return s;
	}
	
	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	/*public String toString() {
		String s = curso + "\n";
		for (double nota : notas) {
			s += nota + " ";
		}
		return s;
	}*/
	
	

}
