package turma51;
import java.util.Scanner;

public class Repeti2 {
	
	public static void main(String[] args) {
		
		
		int x=0, soma=0;
		
		Scanner number = new Scanner(System.in);

			do
			{
				System.out.println("\n Digite um número: ");
				x = number.nextInt();
				
				soma += x;  // soma = soma + x
				
				}
			while (x != 0); 
			
			System.out.println("\n Resultado: " +soma);
			
			
	}
	

}