package com.natalia.cursojava.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
				
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
				
		return this.divideKmPorConsumoCombustivel(km);
	}

}
