package entidade;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.titular = nome;
		deposito(depositoInicial);
	}

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.titular = nome;
	}

	public double getNumero() {
		return numero;
	}

	public String getNome() {
		return titular;
	}
	public void setNome(int numero) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void retirada(double quantia) {
		saldo -= quantia + 5;
	}

	
	public String toString() {
		return "Conta " + numero 
				+ ", Nome: " 
				+ titular + ", Saldo: $ " 
				+ String.format("%.2f", saldo);
	}
	
}
