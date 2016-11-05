import java.util.Scanner;
public class Hello {

	public static void main(String[] args){
Scanner  scanner = new Scanner(System.in);
System.out.println("Podaj swoj wiek: ");

int age = scanner.nextInt();

//System.out.println("Twoj wiek to: "+age);
switch(age){
case 1: System.out.println("Masz roczek");break;
case 2: System.out.println("Masz 2 latka");break;
default:
	System.out.println("Nie znam twojego wieku");}
}

}
