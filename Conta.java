package Entidade;
 
public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    
    
 
    public Conta(int numero, String nome, double saldo) {
		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
 
	public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        
    }
 
    public Conta(String nome2, int numero2, double saldo2, double limite) {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
        return numero;
    }
 
    public void setNumero(int numero) {
        this.numero = numero;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente!");
        }
    }
 
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
 
    public void imprimir() {
        System.out.println("Número: " + getNumero());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }
    
    public String mostrar() {
    	return " O nome é " + nome + " O saldo é " + saldo;
    		
    }
}