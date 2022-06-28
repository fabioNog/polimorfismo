package pck;

import java.util.TimerTask;

import javax.swing.JOptionPane;

public class RelogioMedieval extends Alarme{
	
	

	public RelogioMedieval(String volume, int tempoDeDuracao) {
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
		// TODO Auto-generated method stub
		 int delay = 3000;   
		 this.timer3.scheduleAtFixedRate(new TimerTask() {
		        public void run() {
		            JOptionPane.showMessageDialog(null, "Tocando Relogio Medieval");         
		        }
		        }, delay, this.getTempoDeDuracao());

	}

	@Override
	public void tocar() {
		System.out.println("Tic Tac Toc ...");
		
	}

}
