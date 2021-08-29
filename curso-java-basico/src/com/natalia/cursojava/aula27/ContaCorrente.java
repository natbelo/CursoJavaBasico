package com.natalia.cursojava.aula27;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	double limite;
	
	boolean realizarSaque(double quantiaASacar) {
		
		//tem saldo na conta
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else { //não tem saldo na conta
			if (especial) {
				//verificar se o limite especial tem saldo
			//	double limite = limite + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; //não é especial e não tem saldo suficiente
			}
		}
		
	}

}
