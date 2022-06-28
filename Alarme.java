package pck;

import java.util.Timer;

public abstract class Alarme implements Notificacao {
	Timer timer1 = new Timer();
	Timer timer2 = new Timer();
	Timer timer3 = new Timer();
	
	private String volume;
	private int tempoDeDuracao;
	
	public Alarme(String volume, int tempoDeDuracao) {
		super();
		setVolume(volume);
		setTempoDeDuracao(tempoDeDuracao);
	}
	
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getTempoDeDuracao() {
		return tempoDeDuracao;
	}
	public void setTempoDeDuracao(int tempoDeDuracao) {
		this.tempoDeDuracao = tempoDeDuracao;
	}
	
	 public void PararTarefas(){
	       // Encerra as tarefas	
	       timer1.cancel();
	       timer2.cancel();
	       timer3.cancel();
	    }
	  

	
	public abstract void tocar();

}
