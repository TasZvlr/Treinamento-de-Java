import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.print("Digite um número: ");
		
		int numero = scanner.nextInt();
		
	    if (numero<0){
	        System.out.println("Seu número é negativo.");
	    }
	    else if (numero>0){
	        System.out.println("Seu número é positivo.");
	    }
	    else if (numero==0){
	        System.out.println("Seu número é 0.");
	    };
	}
}