package flappybat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements MouseListener {
	
    Bat bat = new Bat(300, 300);
   // private int x, y;
    
    Pipes pipe = new Pipes (200,200);
 //   private int x, y;

	
public GamePanel() throws IOException {
		
	setLayout(null);
	addMouseListener(this);
	setFocusable(true);
	add(bat);
	add(pipe);
	
//g³owny napis nazwy gry
	JLabel textTitle = new JLabel("Flappy Bat");
	textTitle.setFont(new Font ("Snap ITC", Font.BOLD, 28 ));
	Color c = new Color(51,0,102);
	textTitle.setForeground(c);
	textTitle.setBounds(160, 100, 350, 60);
	add(textTitle);

//instrukcja startu gry
	JLabel textStart = new JLabel("Tap on the Bat to START");
	textStart.setFont(new Font ("Snap ITC", Font.BOLD, 20 ));
	textStart.setForeground(c);
	textStart.setBounds(100, 400, 400, 40);
	add(textStart);


	}
	
	public void mouseClicked(MouseEvent arg0) {
		 bat.setY(bat.getY() - bat.getWysokosc());
	        repaint();
		
	}


	public void mouseEntered(MouseEvent arg0) {

	}


	public void mouseExited(MouseEvent arg0) {

	}


	public void mousePressed(MouseEvent arg0) {
		
	}


	public void mouseReleased(MouseEvent arg0) { //trzeba dodaæ grawitacjê
	//	bat.setY(bat.getY() + bat.getWysokosc());
       //    repaint();
		
	}
	
@Override
public Dimension getPreferredSize() {
	return new Dimension(480, 660);
}
//dodanie t³a
@Override
protected void paintComponent( Graphics g ){
super.paintComponent( g );
Image im = getToolkit().getImage("src/main/resources/flappybattlo.png");
g.drawImage( im, 0, 0, this );
}

}

