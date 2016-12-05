import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import javax.swing.JFrame;

public class OdczytajAll extends JFrame 
{
	public OdczytajAll()
	{
		setSize(300,200);
		setTitle("Wgrywanie CSORepository");
	}
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		System.out.println("BenGGG");
		try 
		{
			BufferedReader all = new BufferedReader(new FileReader("E:\\SKR\\_Skrypty\\checkt\\checkt\\all.txt"));	
			int [][] tablica; 
//			for(int i=0l i<)
			
			String line;
			while((line = all.readLine()) != null)
			{
			    System.out.println(line);
		    
			}
		all.close();
		} 
		catch (FileNotFoundException okno)
		{
			System.out.println("BenG2");
		} 
	}
}
