package pck.encapsulmento;

import pck.heranca.Veiculo;

public class CarroCorrida extends Veiculo{
	
	private boolean turbo;

	public CarroCorrida(int numeroCarro, String Piloto, String Equipe, float VelocidadeMaxima,boolean turbo) {
		super(numeroCarro, Piloto, Equipe, VelocidadeMaxima);
		this.setTurbo(turbo);
	}

	@Override
	public void tipoDeVeiculo() {
		System.out.println("Sou um carro de corrida");		
	}
	

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	public boolean turboLigado() {
		if(this.turbo == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public void acelerar(double acelerar) {
		if(this.estaLigado()) {
			if(this.turboLigado()) {
				if(this.velocidadeAtual <= this.velocidadeMaxima) {
					this.velocidadeAtual = 2*(this.velocidadeAtual + this.velocidadeAtual*(acelerar/100));	
				}else {
					this.velocidadeAtual = this.velocidadeMaxima;
				}
			}
		}
		else {
			this.ligar();
		}
		
	}

	@Override
	public void exibeVeiculo() {
		System.out.println(this.getNome());
		System.out.println(this.getVelocidadeMaxima());
		System.out.println(this.getQuantidade_porta());
		System.out.println(this.piloto);
		System.out.println(this.equipe);		
	}
	
}

