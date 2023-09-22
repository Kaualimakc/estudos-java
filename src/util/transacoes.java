package util;

public class transacoes {
	private int number;
	private String name;
	private double saldo;
	
	
	public transacoes(int number, String name, double saldo) {
		super();
		this.number = number;
		this.name = name;
		this.saldo = saldo;
	}
	public transacoes(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSaldo() {
		return saldo;
	}
	public double depositvalue(double value) {
		return this.saldo += value;
	}
	public double withdrawvalue(double value) {
		return this.saldo -= (value + 5.00) ;
	}
}
