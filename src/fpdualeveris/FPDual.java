package fpdualeveris;

import operators.Ball;
import operators.Player;
import operators.Pinball;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Llamada al metodo*/
		operatorsChallenge();
		
		
		/*
		 * UTILIZACION DE INSTANCE OF
		 * */
		/*Creacion de un array de ojetos de tipo Java*/
		Pinball [] ps = new Pinball [2];
		
		Pinball p1 = new Ball(8);
		Pinball p2 = new Player("Ana");
		
		ps[0] = p1;
		ps[1] = p2;
		

		/*Recorida del array de objetos*/
		for(int i=0; i<ps.length; i++) {
			/*Si el objeto de dentro del array es un Player muestra el nombre confirmando de que es un Player(jugador)*/
			if(ps[i] instanceof Player) {
				System.out.println(((Player) ps[i]).getName()+" is a Player");
			}else {
				/*Si el objeto no es un jugador mostrara el metodo toString que tenga el objeto*/
				System.out.println(ps[i].toString());
			}
		}
	}
	
	private static void operatorsChallenge() {
		/*Creacion de un objeto de la clase Pinball*/
		Pinball p = new Pinball();
		/*Lanzamiento de una bola*/
		p.launchBall();
		/*Muestra de puntuación*/
		System.out.println(p.showPoints());
	}

}
