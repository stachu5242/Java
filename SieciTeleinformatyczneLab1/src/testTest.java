import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class testTest 
{
	
	public static int wystapienie_litera(String napis, char litera)
	{
		int ile_liter=0;
		
		char znak_z_napisu;
		for(int i=0;i<napis.length();i++)
		{
			znak_z_napisu = napis.charAt(i);
			if(znak_z_napisu==litera)
			{
				ile_liter++;
			}
		}
		
		return ile_liter;
	}
	
	
	public static void main(String[] args)throws FileNotFoundException 
	{
		
		File plik = new File("Pierwszy.txt");
		PrintWriter zapis = new PrintWriter(plik);
		String napis = "Inwokacja bo tak";
		zapis.print(napis);
		zapis.close();

		Scanner odczyt = new Scanner(plik);
		String text = odczyt.nextLine();
		System.out.println(text);
		String binary = new BigInteger(text.getBytes()).toString(2);
		System.out.println(binary);
		
		
		if(wystapienie_litera(binary,'1')%2==0)
		{
			binary +=  '1';
		}
		else
		{
			binary += '0';
		}
		
		System.out.println(binary);
		
		
			
		}
	}

}
