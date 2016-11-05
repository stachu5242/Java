package PobieranieIWyswietlanieObrazow;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ObrazPanel extends JPanel {
	private BufferedImage image;
	public ObrazPanel(){
		super();
		File imageFile = new File("Diablo.jpg");
	
		try{
			image = ImageIO.read(imageFile);
		}catch(IOException e)
		{
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}
		Dimension dimension = new Dimension(image.getWidth(),image.getHeight());
		setPreferredSize(dimension);
	}
		public void paintCompoment(Graphics g){
			
			Graphics2D g2D = (Graphics2D) g;
			g2D.drawImage(image,0,0,this);
			
		}
		
	}
	


