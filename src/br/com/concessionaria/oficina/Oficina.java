package br.com.concessionaria.oficina;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculo;

public class Oficina {
	String nomeOficina;
	List <Mecanico> listaMecanicos=new ArrayList<Mecanico>();
	List <Peca> listaPecas=new ArrayList<Peca>();
	List <Veiculo> listaVeiculos=new ArrayList<Veiculo>();
	int pecasNecessarias;
	
	public Oficina(String nomeOficina) {
		//super();
		this.nomeOficina = nomeOficina;
	}
	
	public void adicionarMecanico(Mecanico mecanico) {
		this.listaMecanicos.add(mecanico);
	}
	public void removerMecanico (Mecanico mecanico) {
		this.listaMecanicos.remove(mecanico);
	}
	public void adicionarPeca (Peca peca) {
		this.listaPecas.add(peca);
	}
	public void removerPeca (Peca peca) {
		this.listaPecas.remove(peca);
	}
	public void adicionarVeiculo (Veiculo veiculo) {
		this.listaVeiculos.add(veiculo);
		
	}
	public void removerVeiculo (Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);
	}
	public int verificarPecasRevisao () {
		Random random = new Random();
		int peca = random.nextInt(3);
		return peca;
	}
	public boolean realizarRevisaoVeiculos() {
		return true;
	}
	public float valorTotalPecas() {
		return 0;
	}
}
