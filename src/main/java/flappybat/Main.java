package flappybat;

import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
public static void main(String[] args) throws IOException {
		
		
		JFrame window = new JFrame("Flappy Bat");
		
		GamePanel panel = new GamePanel();
		
		ImageIcon img = new ImageIcon("src/main/resources/netoperek1.png");
		window.setIconImage(img.getImage());
		
		window.add(panel);
		window.setLocation(200, 100);
		window.setSize(350,640);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		

}
}


