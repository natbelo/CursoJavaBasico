package com.natalia.cursojava.aula36;

public class Agenda {
	
	private String nome;
	private ContatoExer01[] contatos;
	
	public Agenda() {
		
	}

	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContatoExer01[] getContatos() {
		return contatos;
	}

	public void setContatos(ContatoExer01[] contatos) {
		this.contatos = contatos;
	}

	public String obterInfo(){
		String info = "Nome = " + nome + "\n";
		
		if (contatos != null) {
			for (ContatoExer01 c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		
		return info;		
		
	}
	

}
