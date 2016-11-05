package sieci1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main{

    public static void main(String[] args)throws FileNotFoundException {

        File plik = new File("Pierwszy.txt");
        PrintWriter zapis = new PrintWriter(plik);
        zapis.println("Inwokacja bo tak ");
        zapis.close();

        Scanner odczyt = new Scanner(plik);
        String text = odczyt.nextLine();
        System.out.println(text);
        String binary = new BigInteger(text.getBytes()).toString(2);
        System.out.println(binary);




    }

}
