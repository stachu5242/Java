package PobieranieIWyswietlanieObrazow;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ObrazFrame extends JFrame {
public ObrazFrame(){
	super("Program Obrazkowy");
	JPanel obrazPanel = new ObrazPanel();
	add(obrazPanel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setVisible(true);
}
}
