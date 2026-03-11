import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite um número de 1 a 7: ");
		int data2 = scanner.nextInt();
		
		String semana;
		switch (data2) {
		    case 1:
		        semana = "Domingo";
		       System.out.println("Seu número de dia da semana é:  "+ semana);
		      break;
		      
		    case 2:
		        semana = "Segunda-feira";
		       System.out.println("Seu número de dia da semana é: "+ semana);
		      break;
		      
		    case 3:
		        semana = "Terça-feira";
		       System.out.println("Seu número de dia da semana é: "+ semana);
		      break;
		      
		    case 4:
		        semana = "Quarta-feira";
		       System.out.println("Seu número de dia da semana é: "+ semana);
		      break;
		      
		    case 5:
		        semana = "Quinta-feira";
		       System.out.println("Seu número de dia da semana é: "+ semana);
		      break;
		      
		    case 6:
		        semana = "Sexta-feira";
		       System.out.println("Seu número de dia da semana é: "+ semana);
		      break;
		      
		    case 7:
		        semana = "Sábado";
		       System.out.println("Seu número de dia da semana é: "+ semana);
		      break;
		      
		    default:
		    System.out.println("ERROR 404");
		}
		scanner.close();
	};
}