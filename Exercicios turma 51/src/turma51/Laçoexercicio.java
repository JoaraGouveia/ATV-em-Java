package turma51;

import java.util.Scanner;

public class Laçoexercicio {

	public static void main(String[] args) {
		
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n Digite a idade do alune: ");
		idade = leia.nextInt();
		
	if (idade>=10 && idade<=14) {
		System.out.println("\n Categoria Infantil! ");
	}
	
	else if (idade>=15 && idade<=17) {
		System.out.println("\n Categoria Juvenil! ");
		
	}
	else if (idade>=18 && idade<=25) {
			System.out.println("\n Categoria Adulto! ");
			
			
		}
	else { 
		System.out.println("Categoria não encontrada");
	}
	}

}