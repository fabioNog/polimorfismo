package pck.polimorfismo;
import java.util.ArrayList;
import java.util.Random;

import pck.encapsulmento.Caminhao;
import pck.encapsulmento.CarroCorrida;
import pck.encapsulmento.CarroPasseio;
import pck.encapsulmento.Moto;

public class main {

	public static void main(String[] args) {
		
		 Random gerador = new Random();
		
		ArrayList<Transitavel> veiculos = new ArrayList<Transitavel>();
		Transitavel CC1 = new CarroCorrida(10,"Carlos","McLaren",400,true);
		Transitavel CC2 = new CarroCorrida(12,"Sebastiao","McLaren",340,false);
		Transitavel CP = new CarroPasseio("Monza",4,200);
		Transitavel MT = new Moto(20,"Pedro","Hornet",350,20);
		Transitavel CM = new Caminhao(23,"Jose","Scanner",350,1000,900);
		
		veiculos.add(CC1);
		veiculos.add(CC2);
		veiculos.add(CP);
		veiculos.add(MT);
		veiculos.add(CM);
		
		int size = veiculos.size();
		
		for (int i = 0; i < size; i++) {
			
            veiculos.get(i).acelerar(gerador.nextInt());
        }
		
		for (int i = 0; i < size; i++) {
			
            veiculos.get(i).exibeVeiculo();
        }
		
	}

}

