package pck;

public class main {

	public static void main(String[] args) {		
		Alarme despertador = new Despertador("alto",2000);
		Alarme ambulancia = new Ambulancia("baixo",3000);
		Alarme medieval = new RelogioMedieval("medio",6000);

		Notificacao D = despertador.addAlarme(despertador);
		Notificacao A = ambulancia.addAlarme(ambulancia);
		Notificacao M = medieval.addAlarme(medieval);
		
		D.notificar();
		D.addAlarme(despertador).tocar();
		
		A.notificar();
		A.addAlarme(ambulancia).tocar();
		
		M.notificar();
		M.addAlarme(medieval).tocar();
		
		D.addAlarme(despertador).PararTarefas();
		
	}

}
