package flappybat;

public class Pipes {
	
	private int x;
	private int y;
	
	
	
	public int Width = 75;
	public int Height = 500;
	public int PipeDistance = 170;
	public int Speed = 2;
	
	
	
	
	// sprawdzanie czy jest kolizja nietoperza z rur¹
	
	public boolean isCollision( int dX, int dY, int dW, int dH) {
		if(dX > x && dY < 0) {
			return true;
			
		}
		return dX < x + Width && dX + dW > x &&
				dY< y + Height && dY + dH >y;
				
	}
	
	

	public int getX () {
		return x;
	}

	public int getY () {
		return y;
	}


	public void setY (int newY) {
		y = newY;
	}

}
