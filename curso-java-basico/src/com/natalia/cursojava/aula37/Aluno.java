package com.natalia.cursojava.aula37;

public class Aluno extends Pessoa {
	
	private String cursos;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	
	
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
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
		super.setCpf("010101010101");
		
		this.setCpf("010101010101");
	}
	
	

}
