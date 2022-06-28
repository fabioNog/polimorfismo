package pck.encapsulmento;

import pck.heranca.Veiculo;

public class Moto extends Veiculo{
	
	private int bagagem;

	public Moto(int numeroCarro, String Piloto, String Equipe, float VelocidadeMaxima,int bagagem) {
		super(numeroCarro, Piloto, Equipe, VelocidadeMaxima);
		this.setBagagem(bagagem);
	}
	
	public int getBagagem() {
		return bagagem;
	}

	public void setBagagem(int bagagem) {
		this.bagagem = bagagem;
	}

	@Override
	public void tipoDeVeiculo() {
		System.out.println("Sou uma moto");
		
	}

	@Override
	public void exibeVeiculo() {
		this.tipoDeVeiculo();
		System.out.println(this.getVelocidadeMaxima());
		System.out.println(this.getBagagem());
		System.out.println(this.getVelocidadeMaxima());
		System.out.println(this.piloto);
		System.out.println(this.equipe);		
	}


}
