package pck.heranca;

import pck.polimorfismo.Transitavel;

public abstract class Veiculo implements Transitavel{
	private int numeroCarro;
	public String piloto;
	public String equipe;
	protected double velocidadeMaxima;
	protected double velocidadeAtual;
	private boolean ligado;
	private int quantidade_porta;
	private String nome;
	
	public Veiculo(int numeroCarro,String Piloto,String Equipe,double VelocidadeMaxima) {
		this.numeroCarro = numeroCarro;
		this.piloto = Piloto;
		this.equipe = Equipe;
		this.ligado = false;
		setVelocidadeMaxima(VelocidadeMaxima);
	}
	
	public Veiculo(String nome, int quantidade_porta, double velocidadeMaxima) {
		this.setQuantidade_porta(quantidade_porta);
		this.setNome(nome);
		this.setVelocidadeMaxima(velocidadeMaxima);
	}
	
	

	public int getQuantidade_porta() {
		return quantidade_porta;
	}

	public void setQuantidade_porta(int quantidade_porta) {
		this.quantidade_porta = quantidade_porta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean estaLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public boolean estaParado() {
		if(this.velocidadeAtual == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void acelerar(double acelerar) {
		if(this.ligado) {
			if(this.velocidadeAtual <= this.velocidadeMaxima) {
				this.velocidadeAtual = this.velocidadeAtual + this.velocidadeAtual*(acelerar/100);	
			}else {
				this.velocidadeAtual = this.velocidadeMaxima;
			}
		}
		else {
			this.ligar();
		}
	}
	
	public void frear(double acelerar) {
		if(this.ligado) {
			if(this.velocidadeAtual >= 0) {
				this.velocidadeAtual = this.velocidadeAtual - this.velocidadeAtual*(acelerar/100);	
			}
			else {
				this.velocidadeAtual = 0;
			}
		}
	}
	
	public abstract void tipoDeVeiculo();
	
	public void exibeVeiculo() {
		System.out.print("Erro: veículo de tipo indefinido");
	}

}
