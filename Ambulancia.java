package pck;

import java.util.TimerTask;

import javax.swing.JOptionPane;

public class Ambulancia extends Alarme{

	public Ambulancia(String volume, int tempoDeDuracao) {
		super(volume, tempoDeDuracao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Alarme addAlarme(Alarme alarme) {
		// TODO Auto-generated method stub
		return alarme;
	}

	@Override
	public void notificar() {
		int delay = 3000;   
		 this.timer2.scheduleAtFixedRate(new TimerTask() {
		        public void run() {
		            JOptionPane.showMessageDialog(null, "Tocando Ambulancia");         
		        }
		        }, delay, this.getTempoDeDuracao());		
	}

	@Override
	public void tocar() {
		System.out.println("Woo Waa Woo Waa");		
	}

}
