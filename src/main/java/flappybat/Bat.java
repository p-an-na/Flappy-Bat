package flappybat;

import java.awt.Component;

//porusza siê do góry, przy naciœniêciu na niego plansza siê przesuwa do przodu i wyskakuj¹ kolejne przeszkody. Nie naciskamy myszk¹ spada w dó³
public class Bat  extends Component implements IMove {
	private String name;
	private int xAxis;
	private int yAxis;

	
	private int dx;
	private int dy;
	
	public Bat(String name, int Xaxis, int Yaxis) {
		this.name = name;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.dx = 3;
		this.dy = 3;
	}

	@Override
	public String toString() {
		return "Bat [name=" + name + ", polozenieNaOsiX=" + xAxis + ", polozenieNaOsiY="
				+ yAxis + "]";
	}


	public void moveUp(int units) {
		xAxis -= units * dx;
		yAxis += units * dy;
		
	}

	public void moveDown(int units) {
		xAxis += units * dx;
		yAxis -= units * dy;
		
	}

	public void position() {
		// TODO Auto-generated method stub
		
	}
	
	
}

