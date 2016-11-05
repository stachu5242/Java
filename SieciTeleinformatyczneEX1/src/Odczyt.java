import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Odczyt  {
  {
      File file = new File("ala.txt");
      Scanner in;
	try {
		in = new Scanner(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
  }
}