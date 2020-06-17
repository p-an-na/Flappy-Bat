package flappybat;

import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
public static void main(String[] args) throws IOException {
		
		
		JFrame window = new JFrame("Flappy Bat");
		
		GamePanel panel = new GamePanel();
		
		ImageIcon img = new ImageIcon("C:/Users/anpie/eclipse-workspace2/Flappy-bat/src/main/resources/netoperek1.png");
		window.setIconImage(img.getImage());
		
		window.add(panel);
		window.setLocation(200, 100);
		window.setSize(350,640);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		
		Bat b1 = new Bat ("Nietoperek", -5, 5);
		
		b1.moveUp(2);
		b1.moveDown(2);
	}
}


