package operators;

public class Pinball {
	
	int numBalls=10; //Cada jugador tiene 10 bolas
	int points=0; //Inicializamos la puntuación a 0

	
	
	public Pinball() {
		super();
	}

	//Metodos
	public void launchBall() {
		/*Cada vez que se lanze este metodo el numero de Balls bajará*/
		numBalls--;
		int numRandom =0;
		
		/*Cada vez que se lanza la bola se suma 5 points SIEMPRE*/
		points = points +5;
		
		/*Si el numreo de bollas no es 0 significa que sigue teniendo bolas por lo que puede
		 * seguir jugando*/
		if(numBalls!=0) {
			do {
				numRandom = (int)Math.floor(Math.random()*(50-0+1));  /* Valor entre 50 y 0, ambos incluidos.*/
				
				if(numRandom==10 || numRandom==40) {
					/*Si el numero aleatorio es 10 on 40 significa que le ha dado a la esquina
					 * de la maquina y ha sumado 10 points*/
					points+=10;
				}else if(numRandom==20 || numRandom==30) {
					/*Si el numero aleatorio es 20 on 30 significa que le ha dado a las barras de arriba
					 * de la maquina y ha sumado 15 points*/
					points+=15;
				}else if(numRandom==25) {
					/*Si el numero aleatorio es 50 significa que la bola ha dado en el COMBO por lo que
					 * suma 25 points*/
					points+=25;
				}else {
					points+=2;/* Si no le da a ninguna de las puntuaciones suma solo 2 points*/
				}
				
				
			}while(numRandom!=0);/*Si el numero es 0 termina el juego*/
				
				
		}
				
	}
	
	public String showPoints() {
		
		String levelPoints=(points>50) ? "La puntuacion es elevada": "La puntuacion es baja";
		System.out.println(levelPoints);
		
		return "La puntuación es de "+points+" points.";
		
		
	}
}
