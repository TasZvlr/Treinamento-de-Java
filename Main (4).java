import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Digite o seu primeiro número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o seu segundo número: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Escolha a operação: +, -, * ou /.");
		char op = sc.next().charAt(0);
		
		double resultado;
		
		switch (op) {
		    case '+':
		        resultado = num1 + num2;
		  System.out.println("Seu resultado da soma é: "+ resultado);
		  break;
		  
		  case '-':
		      resultado = num1 - num2;
		  System.out.println("Seu resultado da sub é: "+ resultado);
		  break;
		  
		  case '*':
		      resultado = num1 * num2;
		  System.out.println("Seu resultado da mult é: "+ resultado);
		  break;
		  
		  case '/':
		      resultado = num1/num2;
		  System.out.println("Seu resultado da divisão é: "+ resultado);
		  break;
		  
		  default:
		  System.out.println("Operação inválida!");
		}
		sc.close();
	};
}