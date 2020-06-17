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

public class GamePanel extends JPanel {
	
	
	Bat b1 = new Bat ("Nietoperek", -5, 5);

	class ActionOnButtons implements MouseListener {
	
	
	// klikniêcie na nietoperka idzie do gory
	public void mouseClicked(MouseEvent e) {
		
		b1.moveUp(50);
		//dopisaæ zmianê miejsca nietoperka
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
		
	}
	// po klikniêciu spada w dó³
	public void mouseReleased(MouseEvent e) {
		b1.moveDown(50);
		
	}
	
	}
	
	
	public GamePanel() throws IOException {
		
	setLayout(null);
	
//g³owny napis nazwy gry
	JLabel textTitle = new JLabel("Flappy Bat");
	textTitle.setFont(new Font ("Snap ITC", Font.BOLD, 28 ));
	Color c = new Color(51,0,102);
	textTitle.setForeground(c);
	textTitle.setBounds(240, 100, 350, 60);
	add(textTitle);
//nietoperek jako przycisk
	BufferedImage buttonIcon = ImageIO.read(new File ("src/main/resources/netoperek1.png"));
    JButton batButton = new JButton(new ImageIcon(buttonIcon));
    //batButton.add(b1);
    batButton.setBorderPainted(false);
    batButton.setFocusPainted(false);
    batButton.setContentAreaFilled(false);
    batButton.setBounds(300, 280, 100, 30);
    batButton.addMouseListener(new ActionOnButtons());
	add(batButton);
	//instrukcja startu gry
	JLabel textStart = new JLabel("Tap on the Bat to START");
	textStart.setFont(new Font ("Snap ITC", Font.BOLD, 20 ));
	textStart.setForeground(c);
	textStart.setBounds(180, 400, 400, 40);
	add(textStart);

//klikanie na nietoperka
  batButton.addMouseListener(new ActionOnButtons());
	}
	
	
@Override
public Dimension getPreferredSize() {
	return new Dimension(700, 700);
}
//dodanie t³a
@Override
protected void paintComponent( Graphics g ){
super.paintComponent( g );
Image im = getToolkit().getImage("src/main/resources/flappybattlo.png");
g.drawImage( im, 0, 0, this );
}

}

