import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
public class MyFrame extends JFrame{

	public MyFrame()
	{
		super("Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setLocation(50,50);
		setLayout(new GridLayout(2,6));
		/*Container container =getContentPane();
		container.add(new JButton("Przycisk 1"));
		container.add(new JButton("Przycisk 2"));
		container.add(new JButton("Przycisk 3"));*/
		
		for(int i=0;i<10;i++)
		add(new JButton(" "+(i+1)));
		setVisible(true);
	}
	
}
