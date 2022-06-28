package pck;

import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Despertador extends Alarme{		
	
	public Despertador(String volume, int tempoDeDuracao) {
		super(volume, tempoDeDuracao);
	}

	@Override
	public Alarme addAlarme(Alarme alarme) {
		// TODO Auto-generated method stub
		return alarme;
	}

	@Override
	public void notificar() {
		int delay = 3000;   
		 this.timer1.scheduleAtFixedRate(new TimerTask() {
	        public void run() {
	            JOptionPane.showMessageDialog(null, "Tocando o despertador");         
	        }
		  }, delay, this.getTempoDeDuracao());
		
		
	}

	@Override
	public void tocar() {
		System.out.println("Triiiiiimmmm"); 
		
	}

}
