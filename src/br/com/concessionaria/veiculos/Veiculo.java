package br.com.concessionaria.veiculos;

public class Veiculo {
	String  placa;
	int ano;
	int modelo;
	String numeroChassi;
	String cor;
	int kmRodados;
	
	public Veiculo(String placa, int ano, int modelo, String numeroChassi, String cor, int kmRodados) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.numeroChassi = numeroChassi;
		this.cor = cor;
		this.kmRodados = kmRodados;
	}
	
	public void informarQuilometragem(int quilometragem) {
		
	}
	

}
