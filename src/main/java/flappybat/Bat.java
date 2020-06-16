package flappybat;
//porusza siê do góry, przy naciœniêciu na niego plansza siê przesuwa do przodu i wyskakuj¹ kolejne przeszkody. Nie naciskamy myszk¹ spada w dó³
public class Bat implements IMove {
	private String name;
	private int Xaxis;
	private int Yaxis;

	
	private int dx;
	private int dy;
	
	public Bat(String name, int polozenieNaOsiX, int polozenieNaOsiY) {
		this.name = name;
		this.Xaxis = polozenieNaOsiX;
		this.Yaxis = polozenieNaOsiY;
		this.dx = 2;
		this.dy = 2;
	}

	@Override
	public String toString() {
		return "Bat [name=" + name + ", polozenieNaOsiX=" + Xaxis + ", polozenieNaOsiY="
				+ Yaxis + "]";
	}


	public void move(int units) {
		// TODO Auto-generated method stub
		
	}

	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	public void position() {
		// TODO Auto-generated method stub
		
	}
	
	
}

