package pck.encapsulmento;

import pck.heranca.Veiculo;


public class CarroPasseio extends Veiculo{
	
	public CarroPasseio(String nome, int quantidade_porta, double velocidadeMaxima) {
		super(nome, quantidade_porta, velocidadeMaxima);
		// TODO Auto-generated constructor stub
	}


	private String porta;
	
	
	
	
	public String getPorta() {
		return porta;
	}


	public void setPorta(String porta) {
		this.porta = porta;
	}


	@Override
	public void tipoDeVeiculo() {
		// TODO Auto-generated method stub
		System.out.println("Sou um carro de passeio");
	}


	@Override
	public void exibeVeiculo() {
		
		this.tipoDeVeiculo();
		System.out.println(this.getPorta());
		System.out.println(this.getVelocidadeMaxima());
	}
	
	

}
