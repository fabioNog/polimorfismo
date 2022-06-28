package pck.encapsulmento;

import pck.heranca.Veiculo;

public class Caminhao extends Veiculo{
	
	private float peso;	
	private double pesoAtual;
	
	public Caminhao(int numeroCarro, String Piloto, String Equipe, float VelocidadeMaxima, float peso, double pesoAtual) {
		super(numeroCarro, Piloto, Equipe, VelocidadeMaxima);
		// TODO Auto-generated constructor stub
		this.setPeso(peso);
		this.setPesoAtual(pesoAtual);
	}
	
	
	public double getPesoAtual() {
		return pesoAtual;
	}


	public void setPesoAtual(double pesoAtual) {
		this.pesoAtual = pesoAtual;
	}


	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public void tipoDeVeiculo() {
		System.out.println("Sou um caminhão");
		
	}

	@Override
	public void exibeVeiculo() {
		this.tipoDeVeiculo();
		System.out.println(this.getPeso());
		System.out.println(this.getNome());
		System.out.println(this.getVelocidadeMaxima());
		System.out.println(this.piloto);
		System.out.println(this.equipe);
		
	}
	
	@Override
	public void acelerar(double acelerar) {
		if(this.estaLigado()) {
			if(this.getPesoAtual() > (this.getPeso()/2)) {
				if(this.velocidadeAtual <= this.velocidadeMaxima) {
					this.velocidadeAtual = (this.velocidadeAtual + this.velocidadeAtual*(acelerar/100))/2;	
				}else {
					this.velocidadeAtual = this.velocidadeMaxima;
				}
			}
		}
		else {
			this.ligar();
		}
		
	}
	
		
}
