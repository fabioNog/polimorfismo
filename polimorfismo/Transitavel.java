package pck.polimorfismo;

public interface Transitavel {
	public void acelerar(double acelerar);
	public void frear(double acelerar);
	public void ligar();
	public void desligar();
	public boolean estaLigado(); 
	public boolean estaParado();
	public void exibeVeiculo();

}
