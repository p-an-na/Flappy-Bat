package flappybat;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Bat extends JLabel{

	 private int x;
	 private int y;
	 private int wysokosc = 30;
	 
	ImageIcon img = new ImageIcon("src/main/resources/netoperek1.png"); //obrazek nietoperza

	public Bat(int x, int y) throws IOException{
	    	
	this.setX(x);
	this.setY(y);
	setIcon(img);
	setOpaque(false);
	setBounds(x, y, 60, 60);
	       
	    }

	    @Override
	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    @Override
	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public int getWysokosc() {
	        return wysokosc;
	    }

	    public void setWysokosc(int wysokosc) {
	        this.wysokosc = wysokosc;
	    }
}
