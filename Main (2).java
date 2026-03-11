import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a sua nota: ");
		int nota = scanner.nextInt();
		
		if (nota>=90){
		    System.out.println("Sua nota é excelente!!!");
		}
		else if (nota>70 && nota<89){
		    System.out.println("Sua nota é boa");
		}
		else if (nota>60 && nota<69){
		    System.out.println("Sua nota é regular.");
		}
		else if (nota<60){
		    System.out.println("Sua nota é PÉSSIMA! Reprovado.");
		};
	}
}