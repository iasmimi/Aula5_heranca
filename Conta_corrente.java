package Entidade;



public class Conta_corrente extends Conta{

	private double limite;

	public Conta_corrente(int numero, String nome, double saldo, double limite) {
		super(nome, numero, saldo, limite);
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta_corrente" + mostrar() + "limite=" + limite + "";
	}
	
	}


