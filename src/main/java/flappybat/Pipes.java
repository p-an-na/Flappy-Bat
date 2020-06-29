package flappybat;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pipes extends JLabel {
	
	private int x;
	private int y;
	
	
	public int Width = 75;
	public int Height = 500;
	public int PipeDistance = 170;
	public int Speed = 2;
	
	ImageIcon img = new ImageIcon("src/main/resources/pipes.png");
	
	public Pipes(int x, int y) throws IOException{
    	
		this.setX(x);
		this.setY(y);
		setIcon(img);
		setOpaque(false);
		setBounds(x, y, 75, 400);
		
	}
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

	public void setX (int x) {
		this.x = x;
	}
	public void setY (int y) {
		this.y = y;
	}

}
