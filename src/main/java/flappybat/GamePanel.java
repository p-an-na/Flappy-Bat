package flappybat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
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
	BufferedImage buttonIcon = ImageIO.read(new File ("C:/Users/anpie/eclipse-workspace2/Flappy-bat/src/main/resources/netoperek1.png"));
    JButton batButton = new JButton(new ImageIcon(buttonIcon));
    batButton.setBorderPainted(false);
    batButton.setFocusPainted(false);
    batButton.setContentAreaFilled(false);
    batButton.setBounds(300, 280, 100, 30);
	add(batButton);
	//instrukcja startu gry
	JLabel textStart = new JLabel("Tap on the Bat to START");
	textStart.setFont(new Font ("Snap ITC", Font.BOLD, 20 ));
	textStart.setForeground(c);
	textStart.setBounds(180, 400, 400, 40);
	add(textStart);


   // batButton.addMouseListener(new MouseAdapter() {
    	//  @Override
    	//  public void mouseClicked(MouseEvent e) {
    	 //    ... handle the click ...
    	//  }
    	//});



	}














	

@Override
public Dimension getPreferredSize() {
	return new Dimension(700, 700);
}
//dodanie t³a
@Override
protected void paintComponent( Graphics g ){
super.paintComponent( g );
Image im = getToolkit().getImage("C:/Users/anpie/eclipse-workspace2/Flappy-bat/src/main/resources/flappybattlo.png");
g.drawImage( im, 0, 0, this );
}
}