package flappybat;

import java.awt.Component;

//porusza si� do g�ry, przy naci�ni�ciu na niego plansza si� przesuwa do przodu i wyskakuj� kolejne przeszkody. Nie naciskamy myszk� spada w d�
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

