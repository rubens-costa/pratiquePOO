package br.com.concessionaria;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;
import br.com.concessionaria.veiculos.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("A123", 2015, 1, "123", "Branco", 10000);
		Veiculo v2 = new Veiculo("A1234", 2018, 2, "1234", "Preto", 20000);
		Veiculo v3 = new Veiculo("A12345", 2020, 3, "12345", "Vermelho", 30000);
		
		Peca p1 = new Peca("Rolamento", 10.00, "10/10/2000");
		Peca p2 = new Peca("Maquita", 10.00, "10/10/2000");
		Peca p3 = new Peca("Macaco", 10.00, "10/10/2000");
		Peca p4 = new Peca("Alicate", 10.00, "10/10/2000");
		Peca p5 = new Peca("Martelo", 10.00, "10/10/2000");
		Peca p6 = new Peca("Chave de fenda", 10.00, "10/10/2000");
		Peca p7 = new Peca("Parafuso", 10.00, "10/10/2000");
		Peca p8 = new Peca("Porca", 10.00, "10/10/2000");
		Peca p9 = new Peca("Mola", 10.00, "10/10/2000");
		Peca p10 = new Peca("Pistao", 10.00, "10/10/2000");
		
		Mecanico m1 = new Mecanico("Pedro", 10, 2);
		Mecanico m2 = new Mecanico("Joao", 12, 4);
		Mecanico m3 = new Mecanico("Lucas", 15, 6);
		
		Oficina oficina = new Oficina ("Oficina do Rubens");
	}

}
