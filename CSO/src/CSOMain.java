import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;



public class CSOMain extends JFrame implements ActionListener 
{
	private JButton bWgraj;
	
	public CSOMain()
	{
		setSize(500,300);
		setTitle("Wgrywanie CSORepository");
		setLayout(null);
		
		bWgraj = new JButton("Wykonaj");
		bWgraj.setBounds(20,20,150,20);
		add(bWgraj);
		bWgraj.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		Object zrodlo = e.getSource();
		if (zrodlo==bWgraj)
		{
			
			try {
				OdczytajAll.main(null);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		
		CSOMain aplikacja = new CSOMain();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}
}
