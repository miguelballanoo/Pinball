package operators;

public class Ball extends Pinball {

	/*Clase para utilizar el instanceof*/

	public int getNumBall() {
		return numBall;
	}

	public void setNumBall(int numBall) {
		this.numBall = numBall;
	}

	int numBall;

	public Ball(int numBall) {
		super();
		this.numBall = numBall;
	}
	
	@Override
	public String toString() {
		return "La bola tiene el numero " + numBall;
	}
}
